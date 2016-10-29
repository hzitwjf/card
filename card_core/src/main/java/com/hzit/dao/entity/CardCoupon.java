package com.hzit.dao.entity;

/**
 * 
 * @author wjf
 */
public class CardCoupon {
	/**
	 *  卡劵ID。主键自增
	 */
	private Integer cardId;
	/**
	 *  卡劵业务ID
	 */
	private String cardUuid;
	/**
	 *  卡劵名字
	 */
	private String cardName;
	/**
	 *  卡劵大图url
	 */
	private String cardBigPicUrl;
	/**
	 *  卡劵小图url
	 */
	private String cardSmallPicUrl;
	/**
	 *  卡劵类型ID
	 */
	private Integer cardTypeId;
	/**
	 *  有效期开始时间
	 */
	private java.util.Date cardStartTime;
	/**
	 *  有效期结束时间
	 */
	private java.util.Date cardEndTime;
	/**
	 *  卡劵库存量
	 */
	private Integer cardStock;
	/**
	 *  领取次数限制
	 */
	private Integer cardRestrict;
	/**
	 *  卡劵状态 0无效 1有效
	 */
	private String cardState;
	/**
	 * 卡劵ID。主键自增
	 * @param cardId
	 */
	public void setCardId(Integer cardId){
		this.cardId = cardId;
	}
	
    /**
     * 卡劵ID。主键自增
     * @return
     */	
    public Integer getCardId(){
    	return cardId;
    }
	/**
	 * 卡劵业务ID
	 * @param cardUuid
	 */
	public void setCardUuid(String cardUuid){
		this.cardUuid = cardUuid;
	}
	
    /**
     * 卡劵业务ID
     * @return
     */	
    public String getCardUuid(){
    	return cardUuid;
    }
	/**
	 * 卡劵名字
	 * @param cardName
	 */
	public void setCardName(String cardName){
		this.cardName = cardName;
	}
	
    /**
     * 卡劵名字
     * @return
     */	
    public String getCardName(){
    	return cardName;
    }
	/**
	 * 卡劵大图url
	 * @param cardBigPicUrl
	 */
	public void setCardBigPicUrl(String cardBigPicUrl){
		this.cardBigPicUrl = cardBigPicUrl;
	}
	
    /**
     * 卡劵大图url
     * @return
     */	
    public String getCardBigPicUrl(){
    	return cardBigPicUrl;
    }
	/**
	 * 卡劵小图url
	 * @param cardSmallPicUrl
	 */
	public void setCardSmallPicUrl(String cardSmallPicUrl){
		this.cardSmallPicUrl = cardSmallPicUrl;
	}
	
    /**
     * 卡劵小图url
     * @return
     */	
    public String getCardSmallPicUrl(){
    	return cardSmallPicUrl;
    }
	/**
	 * 卡劵类型ID
	 * @param cardTypeId
	 */
	public void setCardTypeId(Integer cardTypeId){
		this.cardTypeId = cardTypeId;
	}
	
    /**
     * 卡劵类型ID
     * @return
     */	
    public Integer getCardTypeId(){
    	return cardTypeId;
    }
	/**
	 * 有效期开始时间
	 * @param cardStartTime
	 */
	public void setCardStartTime(java.util.Date cardStartTime){
		this.cardStartTime = cardStartTime;
	}
	
    /**
     * 有效期开始时间
     * @return
     */	
    public java.util.Date getCardStartTime(){
    	return cardStartTime;
    }
	/**
	 * 有效期结束时间
	 * @param cardEndTime
	 */
	public void setCardEndTime(java.util.Date cardEndTime){
		this.cardEndTime = cardEndTime;
	}
	
    /**
     * 有效期结束时间
     * @return
     */	
    public java.util.Date getCardEndTime(){
    	return cardEndTime;
    }
	/**
	 * 卡劵库存量
	 * @param cardStock
	 */
	public void setCardStock(Integer cardStock){
		this.cardStock = cardStock;
	}
	
    /**
     * 卡劵库存量
     * @return
     */	
    public Integer getCardStock(){
    	return cardStock;
    }
	/**
	 * 领取次数限制
	 * @param cardRestrict
	 */
	public void setCardRestrict(Integer cardRestrict){
		this.cardRestrict = cardRestrict;
	}
	
    /**
     * 领取次数限制
     * @return
     */	
    public Integer getCardRestrict(){
    	return cardRestrict;
    }
	/**
	 * 卡劵状态 0无效 1有效
	 * @param cardState
	 */
	public void setCardState(String cardState){
		this.cardState = cardState;
	}
	
    /**
     * 卡劵状态 0无效 1有效
     * @return
     */	
    public String getCardState(){
    	return cardState;
    }

	@Override
	public String toString() {
		return "CardCoupon{" +
				"cardId=" + cardId +
				", cardUuid='" + cardUuid + '\'' +
				", cardName='" + cardName + '\'' +
				", cardBigPicUrl='" + cardBigPicUrl + '\'' +
				", cardSmallPicUrl='" + cardSmallPicUrl + '\'' +
				", cardTypeId=" + cardTypeId +
				", cardStartTime=" + cardStartTime +
				", cardEndTime=" + cardEndTime +
				", cardStock=" + cardStock +
				", cardRestrict=" + cardRestrict +
				", cardState='" + cardState + '\'' +
				'}';
	}
}