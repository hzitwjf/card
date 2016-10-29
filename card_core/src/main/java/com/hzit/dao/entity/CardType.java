package com.hzit.dao.entity;

/**
 * 
 * @author wjf
 */
public class CardType {
	/**
	 *  卡劵类型ID，主键
	 */
	private Integer cardTypeId;
	/**
	 *  卡劵类型名字
	 */
	private String cardTypeName;
	/**
	 * 卡劵类型ID，主键
	 * @param cardTypeId
	 */
	public void setCardTypeId(Integer cardTypeId){
		this.cardTypeId = cardTypeId;
	}
	
    /**
     * 卡劵类型ID，主键
     * @return
     */	
    public Integer getCardTypeId(){
    	return cardTypeId;
    }
	/**
	 * 卡劵类型名字
	 * @param cardTypeName
	 */
	public void setCardTypeName(String cardTypeName){
		this.cardTypeName = cardTypeName;
	}
	
    /**
     * 卡劵类型名字
     * @return
     */	
    public String getCardTypeName(){
    	return cardTypeName;
    }

	@Override
	public String toString() {
		return "CardType{" +
				"cardTypeId=" + cardTypeId +
				", cardTypeName='" + cardTypeName + '\'' +
				'}';
	}
}