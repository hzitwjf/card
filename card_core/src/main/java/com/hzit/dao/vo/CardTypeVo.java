package com.hzit.dao.vo;

/**
 * @author wjf
 * Created  on 2016/10/29.
 */
public class CardTypeVo {
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
     * @return Integer
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
     * @return String
     */	
    public String getCardTypeName(){
    	return cardTypeName;
    }

	@Override
	public String toString() {
		return "CardTypeVo{" +
				"cardTypeId=" + cardTypeId +
				", cardTypeName='" + cardTypeName + '\'' +
				'}';
	}
}