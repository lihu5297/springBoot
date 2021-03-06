/**
 * -------------------------------------------------------------------------
 * @版权所有：北京光宇在线科技有限责任公司
 * @项目名称：action-bean
 * @作者：guoyonggang
 * @联系方式：guoyonggang@gyyx.cn
 * @创建时间：2017年2月27日
 * @版本号：1.0
 * @本类主要用途描述：  
 *-------------------------------------------------------------------------
 */
package cn.gyyx.action.beans.wechatcharge;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
/**
  * <p>
  *   微信奖品兑换信息类
  * </p>
  *  
  * @author guoyonggang
  * @since 0.0.1
 */
public class WechatChargeBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.code
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private Integer code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.channel_name
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private String channelName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.open_id
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private String openId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.nick_name
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.action_name
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private String actionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.charge_code
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private String chargeCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.prize_name
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private String prizeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.prize_type
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private String prizeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.card_no
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private String cardNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.card_pwd
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private String cardPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.is_charge
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private Boolean isCharge;
    
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.is_wendao
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private Boolean isWendao;
    
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.is_delete
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private Boolean isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.recipient_name
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private String recipientName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.recipient_phone
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private String recipientPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.recipient_address
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private String recipientAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.express_number
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private String expressNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.award_time
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    @DateTimeFormat(iso=ISO.DATE)
    private Date awardTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.charge_end_time
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    @DateTimeFormat(iso=ISO.DATE)
    private Date chargeEndTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.charge_time
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private Date chargeTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wechat_charge_tb.create_time
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.code
     *
     * @return the value of wechat_charge_tb.code
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public Integer getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.code
     *
     * @param code the value for wechat_charge_tb.code
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.channel_name
     *
     * @return the value of wechat_charge_tb.channel_name
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.channel_name
     *
     * @param channelName the value for wechat_charge_tb.channel_name
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.open_id
     *
     * @return the value of wechat_charge_tb.open_id
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.open_id
     *
     * @param openId the value for wechat_charge_tb.open_id
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.nick_name
     *
     * @return the value of wechat_charge_tb.nick_name
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.nick_name
     *
     * @param nickName the value for wechat_charge_tb.nick_name
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.action_name
     *
     * @return the value of wechat_charge_tb.action_name
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.action_name
     *
     * @param actionName the value for wechat_charge_tb.action_name
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setActionName(String actionName) {
        this.actionName = actionName == null ? null : actionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.charge_code
     *
     * @return the value of wechat_charge_tb.charge_code
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public String getChargeCode() {
        return chargeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.charge_code
     *
     * @param chargeCode the value for wechat_charge_tb.charge_code
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode == null ? null : chargeCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.prize_name
     *
     * @return the value of wechat_charge_tb.prize_name
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public String getPrizeName() {
        return prizeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.prize_name
     *
     * @param prizeName the value for wechat_charge_tb.prize_name
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName == null ? null : prizeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.prize_type
     *
     * @return the value of wechat_charge_tb.prize_type
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public String getPrizeType() {
        return prizeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.prize_type
     *
     * @param prizeType the value for wechat_charge_tb.prize_type
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setPrizeType(String prizeType) {
        this.prizeType = prizeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.card_no
     *
     * @return the value of wechat_charge_tb.card_no
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.card_no
     *
     * @param cardNo the value for wechat_charge_tb.card_no
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.card_pwd
     *
     * @return the value of wechat_charge_tb.card_pwd
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public String getCardPwd() {
        return cardPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.card_pwd
     *
     * @param cardPwd the value for wechat_charge_tb.card_pwd
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setCardPwd(String cardPwd) {
        this.cardPwd = cardPwd == null ? null : cardPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.is_charge
     *
     * @return the value of wechat_charge_tb.is_charge
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public Boolean getIsCharge() {
        return isCharge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.is_charge
     *
     * @param isCharge the value for wechat_charge_tb.is_charge
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setIsCharge(Boolean isCharge) {
        this.isCharge = isCharge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.is_wendao
     *
     * @return the value of wechat_charge_tb.is_wendao
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public Boolean getIsWendao() {
        return isWendao;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.is_wendao
     *
     * @param isCharge the value for wechat_charge_tb.is_wendao
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setIsWendao(Boolean isWendao) {
        this.isWendao = isWendao;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.is_wendao
     *
     * @return the value of wechat_charge_tb.is_wendao
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.is_wendao
     *
     * @param isCharge the value for wechat_charge_tb.is_wendao
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.recipient_name
     *
     * @return the value of wechat_charge_tb.recipient_name
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.recipient_name
     *
     * @param recipientName the value for wechat_charge_tb.recipient_name
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName == null ? null : recipientName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.recipient_phone
     *
     * @return the value of wechat_charge_tb.recipient_phone
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public String getRecipientPhone() {
        return recipientPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.recipient_phone
     *
     * @param recipientPhone the value for wechat_charge_tb.recipient_phone
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone == null ? null : recipientPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.recipient_address
     *
     * @return the value of wechat_charge_tb.recipient_address
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public String getRecipientAddress() {
        return recipientAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.recipient_address
     *
     * @param recipientAddress the value for wechat_charge_tb.recipient_address
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress == null ? null : recipientAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.express_number
     *
     * @return the value of wechat_charge_tb.express_number
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public String getExpressNumber() {
        return expressNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.express_number
     *
     * @param expressNumber the value for wechat_charge_tb.express_number
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setExpressNumber(String expressNumber) {
        this.expressNumber = expressNumber == null ? null : expressNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.award_time
     *
     * @return the value of wechat_charge_tb.award_time
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public Date getAwardTime() {
        return awardTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.award_time
     *
     * @param awardTime the value for wechat_charge_tb.award_time
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setAwardTime(Date awardTime) {
        this.awardTime = awardTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.charge_end_time
     *
     * @return the value of wechat_charge_tb.charge_end_time
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public Date getChargeEndTime() {
        return chargeEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.charge_end_time
     *
     * @param chargeEndTime the value for wechat_charge_tb.charge_end_time
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setChargeEndTime(Date chargeEndTime) {
        this.chargeEndTime = chargeEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.charge_time
     *
     * @return the value of wechat_charge_tb.charge_time
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public Date getChargeTime() {
        return chargeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.charge_time
     *
     * @param chargeTime the value for wechat_charge_tb.charge_time
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setChargeTime(Date chargeTime) {
        this.chargeTime = chargeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wechat_charge_tb.create_time
     *
     * @return the value of wechat_charge_tb.create_time
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wechat_charge_tb.create_time
     *
     * @param createTime the value for wechat_charge_tb.create_time
     *
     * @mbggenerated Mon Feb 27 15:45:16 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "WechatChargeBean [channelName=" + channelName + ", nickName="
                + nickName + ", actionName=" + actionName + ", prizeName="
                + prizeName + ", prizeType=" + prizeType + ", awardTime="
                + awardTime + ", chargeEndTime=" + chargeEndTime + "]";
    }
    
}