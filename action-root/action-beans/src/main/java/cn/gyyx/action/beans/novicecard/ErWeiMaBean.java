/**
 * -------------------------------------------------------------------------
 * @版权所有：北京光宇在线科技有限责任公司
 * @项目名称：action
 * @作者：yangyusheng
 * @联系方式：yangyusheng@gyyx.cn
 * @创建时间： 2014年12月25日 上午10:53:16
 * @版本号：
 * @本类主要用途描述：二维码实体类
 *-------------------------------------------------------------------------
 */
package cn.gyyx.action.beans.novicecard;

import java.util.Date;

public class ErWeiMaBean {

	private int code;
	private String cardNo;
	private int usedCount;
	private int maxCount;
	private int gameId;
	private String description;
	private Integer itemId;
	private Date startTime;
	private Date endTime;
	private boolean isLimit;
	private Integer batchNo;
	private Integer typeId;
	
	public ErWeiMaBean() {
		
	}
	
	public ErWeiMaBean(String cardNo, int batchNo, int gameId) {
		this.cardNo = cardNo;
		this.batchNo = batchNo;
		this.gameId = gameId;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public int getUsedCount() {
		return usedCount;
	}

	public void setUsedCount(int usedCount) {
		this.usedCount = usedCount;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public boolean isLimit() {
		return isLimit;
	}

	public void setLimit(boolean isLimit) {
		this.isLimit = isLimit;
	}

	public Integer getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(Integer batchNo) {
		this.batchNo = batchNo;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

}
