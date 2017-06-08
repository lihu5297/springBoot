using System;
using System.Collections.Generic;
using System.Web;
using System.IO;
using System.Collections;
using System.Text.RegularExpressions;

namespace ImageUpload
{
    /// <summary>
    /// UEditor编辑器通用上传类
    /// </summary>
    public class Uploader
    {
        string state = "SUCCESS";

        string URL = null;
        string currentType = null;
        string uploadpath = null;
        string filename = null;
        string originalName = null;
        HttpPostedFile uploadFile = null;

        /**
      * 上传文件的主处理方法
      * @param HttpContext
      * @param string
      * @param  string[]
      *@param int
      * @return Hashtable
      */
        public Hashtable upFile(HttpContext cxt, string pathbase, string[] filetype, int size)
        {
            pathbase = pathbase + "/";
            uploadpath = cxt.Server.MapPath(pathbase);//获取文件上传路径

            try
            {
                uploadFile = cxt.Request.Files[0];
                originalName = uploadFile.FileName;

                //目录创建
                createFolder();

                //格式验证
                if (checkType(filetype))
                {
                    //不允许的文件类型
                    state = "\u4e0d\u5141\u8bb8\u7684\u6587\u4ef6\u7c7b\u578b";
                }
                //大小验证
                if (checkSize(size))
                {
                    //文件大小超出网站限制
                    state = "\u6587\u4ef6\u5927\u5c0f\u8d85\u51fa\u7f51\u7ad9\u9650\u5236";
                }
                //保存图片
                if (state == "SUCCESS")
                {
                    filename = NameFormater.Format(cxt.Request["fileNameFormat"], originalName);
                    var testname = filename;
                    var ai = 1;
                    while (File.Exists(uploadpath + testname))
                    {
                        testname = Path.GetFileNameWithoutExtension(filename) + "_" + ai++ + Path.GetExtension(filename);
                    }

                    uploadFile.SaveAs(uploadpath + testname);

                    var url = System.Configuration.ConfigurationManager.AppSettings["UploadUrl"] + "&width=400&height=248";
                    var web = new System.Net.WebClient();

                    byte[] bytes = web.UploadFile(url, uploadpath + testname);

                    string result = System.Text.Encoding.UTF8.GetString(bytes);

                    File.Delete(uploadpath + testname);

                    string regStr="\"Status\":(\\d+)";

                    MatchCollection matchs=Regex.Matches(result,regStr);

                    int status=int.Parse(matchs.Count>0? matchs[0].Groups[1].Value:"0");

                    if (status == 1)
                    {
                        string regStr2 = @"""Url"":""([^""]*)""";
                        matchs = Regex.Matches(result, regStr2);
                        URL = matchs.Count > 0 ? matchs[0].Groups[1].Value : "";
                    }

                    //uploadFile.SaveAs(uploadpath + testname);
                    //URL = pathbase + testname;
                }
            }
            catch (Exception ex)
            {
                // 未知错误
                state = "\u672a\u77e5\u9519\u8bef";
                URL = "";

                var logger = Gyyx.Core.Log.LogFactory.GetLogger(typeof(Uploader));
                logger.Exception(ex);
            }
            return getUploadInfo();
        }

        /**
     * 上传涂鸦的主处理方法
      * @param HttpContext
      * @param string
      * @param  string[]
      *@param string
      * @return Hashtable
     */
        public Hashtable upScrawl(HttpContext cxt, string pathbase, string tmppath, string base64Data)
        {
            pathbase = pathbase + DateTime.Now.ToString("yyyy-MM-dd") + "/";
            uploadpath = cxt.Server.MapPath(pathbase);//获取文件上传路径
            FileStream fs = null;
            try
            {
                //创建目录
                createFolder();
                //生成图片
                filename = System.Guid.NewGuid() + ".png";
                fs = File.Create(uploadpath + filename);
                byte[] bytes = Convert.FromBase64String(base64Data);
                fs.Write(bytes, 0, bytes.Length);

                URL = pathbase + filename;
            }
            catch (Exception e)
            {
                state = "未知错误";
                URL = "";
            }
            finally
            {
                fs.Close();
                deleteFolder(cxt.Server.MapPath(tmppath));
            }
            return getUploadInfo();
        }

        /**
    * 获取文件信息
    * @param context
    * @param string
    * @return string
    */
        public string getOtherInfo(HttpContext cxt, string field)
        {
            string info = null;
            if (cxt.Request.Form[field] != null && !String.IsNullOrEmpty(cxt.Request.Form[field]))
            {
                info = field == "fileName" ? cxt.Request.Form[field].Split(',')[1] : cxt.Request.Form[field];
            }
            return info;
        }

        /**
         * 获取上传信息
         * @return Hashtable
         */
        private Hashtable getUploadInfo()
        {
            Hashtable infoList = new Hashtable();

            infoList.Add("state", state);
            infoList.Add("url", URL);

            if (currentType != null)
                infoList.Add("currentType", currentType);
            if (originalName != null)
                infoList.Add("originalName", originalName);
            return infoList;
        }

        /**
         * 重命名文件
         * @return string
         */
        private string reName()
        {
            return System.Guid.NewGuid() + getFileExt();
        }

        /**
         * 文件类型检测
         * @return bool
         */
        private bool checkType(string[] filetype)
        {
            currentType = getFileExt();
            return Array.IndexOf(filetype, currentType) == -1;
        }

        /**
         * 文件大小检测
         * @param int
         * @return bool
         */
        private bool checkSize(int size)
        {
            return uploadFile.ContentLength >= (size * 1024 * 1024);
        }

        /**
         * 获取文件扩展名
         * @return string
         */
        private string getFileExt()
        {
            string[] temp = uploadFile.FileName.Split('.');
            return "." + temp[temp.Length - 1].ToLower();
        }

        /**
         * 按照日期自动创建存储文件夹
         */
        private void createFolder()
        {
            if (!Directory.Exists(uploadpath))
            {
                Directory.CreateDirectory(uploadpath);
            }
        }

        /**
         * 删除存储文件夹
         * @param string
         */
        public void deleteFolder(string path)
        {
            //if (Directory.Exists(path))
            //{
            //    Directory.Delete(path, true);
            //}
        }
    }


    public static class NameFormater
    {
        public static string Format(string format, string filename)
        {
            if (String.IsNullOrWhiteSpace(format))
            {
                format = "{filename}{rand:6}";
            }
            string ext = Path.GetExtension(filename);
            filename = Path.GetFileNameWithoutExtension(filename);
            format = format.Replace("{filename}", filename);
            format = new Regex(@"\{rand(\:?)(\d+)\}", RegexOptions.Compiled).Replace(format, new MatchEvaluator(delegate(Match match)
            {
                var digit = 6;
                if (match.Groups.Count > 2)
                {
                    digit = Convert.ToInt32(match.Groups[2].Value);
                }
                var rand = new Random();
                return rand.Next((int)Math.Pow(10, digit), (int)Math.Pow(10, digit + 1)).ToString();
            }));
            format = format.Replace("{time}", DateTime.Now.Ticks.ToString());
            format = format.Replace("{yyyy}", DateTime.Now.Year.ToString());
            format = format.Replace("{yy}", (DateTime.Now.Year % 100).ToString("D2"));
            format = format.Replace("{mm}", DateTime.Now.Month.ToString("D2"));
            format = format.Replace("{dd}", DateTime.Now.Day.ToString("D2"));
            format = format.Replace("{hh}", DateTime.Now.Hour.ToString("D2"));
            format = format.Replace("{ii}", DateTime.Now.Minute.ToString("D2"));
            format = format.Replace("{ss}", DateTime.Now.Second.ToString("D2"));
            var invalidPattern = new Regex(@"[\\\/\:\*\?\042\<\>\|]");
            format = invalidPattern.Replace(format, "");
            return format + ext;
        }
    }
}