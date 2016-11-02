package com.hzit.dao.entity;

/**
 * @author wjf
 * Created  on 2016/10/29.
 */
public class CardDetail {
	/**
	 *  卡劵详情ID，主键，自增
	 */
	private Integer cardDetailId;
	/**
	 *  卡劵详情业务ID
	 */
	private String cardDetailUuid;
	/**
	 *  卡劵ID
	 */
	private String cardId;
	/**
	 *  用户ID
	 */
	private String userId;
	/**
	 *  卡劵领取时间
	 */
	private String cardDetailReceiveTime;
	/**
	 *  卡劵明细状态。0 未使用 1 已使用 2 已过期
	 */
	private String cardState;
	/**
	 * 卡劵详情ID，主键，自增
	 * @param cardDetailId
	 */
	public void setCardDetailId(Integer cardDetailId){
		this.cardDetailId = cardDetailId;
	}
	
    /**
     * 卡劵详情ID，主键，自增
     * @return
     */	
    public Integer getCardDetailId(){
    	return cardDetailId;
    }
	/**
	 * 卡劵详情业务ID
	 * @param cardDetailUuid
	 */
	public void setCardDetailUuid(String cardDetailUuid){
		this.cardDetailUuid = cardDetailUuid;
	}
	
    /**
     * 卡劵详情业务ID
     * @return
     */	
    public String getCardDetailUuid(){
    	return cardDetailUuid;
    }
	/**
	 * 卡劵ID
	 * @param cardId
	 */
	public void setCardId(String cardId){
		this.cardId = cardId;
	}
	
    /**
     * 卡劵ID
     * @return
     */	
    public String getCardId(){
    	return cardId;
    }
	/**
	 * 用户ID
	 * @param userId
	 */
	public void setUserId(String userId){
		this.userId = userId;
	}
	
    /**
     * 用户ID
     * @return
     */	
    public String getUserId(){
    	return userId;
    }
	/**
	 * 卡劵领取时间
	 * @param cardDetailReceiveTime
	 */
	public void setCardDetailReceiveTime(String cardDetailReceiveTime){
		this.cardDetailReceiveTime = cardDetailReceiveTime;
	}
	
    /**
     * 卡劵领取时间
     * @return
     */	
    public String getCardDetailReceiveTime(){
    	return cardDetailReceiveTime;
    }
	/**
	 * 卡劵明细状态。0 未使用 1 已使用 2 已过期
	 * @param cardState
	 */
	public void setCardState(String cardState){
		this.cardState = cardState;
	}
	
    /**
     * 卡劵明细状态。0 未使用 1 已使用 2 已过期
     * @return
     */	
    public String getCardState(){
    	return cardState;
    }

	@Override
	public String toString() {
		return "CardDetail{" +
				"cardDetailId=" + cardDetailId +
				", cardDetailUuid='" + cardDetailUuid + '\'' +
				", cardId='" + cardId + '\'' +
				", userId='" + userId + '\'' +
				", cardDetailReceiveTime=" + cardDetailReceiveTime +
				", cardState='" + cardState + '\'' +
				'}';
	}

}