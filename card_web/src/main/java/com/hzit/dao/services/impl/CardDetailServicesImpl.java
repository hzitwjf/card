package com.hzit.dao.services.impl;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.hzit.dao.entity.CardCoupon;
import com.hzit.dao.entity.CardDetail;
import com.hzit.dao.mapper.CardDetailMapper;
import com.hzit.dao.services.CardCouponServices;
import com.hzit.dao.services.CardDetailService;
import com.hzit.dao.vo.CardCouponVo;
import com.hzit.dao.vo.CardDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @author wjf
 * Created  on 2016/10/29.
 */
@Service
public class CardDetailServicesImpl implements CardDetailService {
    @Autowired
    private CardDetailMapper cardDetailMapper;
    @Autowired
    private CardCouponServices cardCouponServices;
    @Override
    public Page<CardDetailVo> findDetailByCardId(String cardUuid, int page, int rowCount) {
        Map map=new HashMap();
        map.put("cardId",cardUuid);
        PageRequest pageRequest=new PageRequest(page,rowCount);
        Page<CardDetailVo> cardDetailVoPage=cardDetailMapper.searchCardDetailByParams(map,pageRequest);
        return cardDetailVoPage;
    }

    @Override
    public List<CardDetailVo> findDetailByUserId(String userId) {
        Map map=new HashMap();
        map.put("userId",userId);
        List<CardDetailVo> cardDetailVoList=cardDetailMapper.searchCardDetailByParams(map);
        return cardDetailVoList;
    }

    @Override
    @Transactional
    public Object addCardDetail( String cardUuid) {
        CardCouponVo cardCouponVo=cardCouponServices.findOneCardCoupon(cardUuid);
        CardDetail cardDetail=new CardDetail();
       try{
           if(cardCouponVo.getCardState().equals("1")){
               if(cardCouponVo.getCardStock()>0){
                   int count=cardDetailMapper.findCount(cardDetail.getUserId(),cardDetail.getCardId());
                   if (cardCouponVo.getCardRestrict()!=count){
                       cardDetail.setCardDetailUuid(UUID.randomUUID().toString());
                       cardDetail.setCardId(cardCouponVo.getCardUuid());
                       cardDetail.setUserId("张三");
                       cardDetail.setCardState("0");
                       cardDetailMapper.insertCardDetail(cardDetail);
                       CardCoupon cardCoupon=new CardCoupon();
                       cardCoupon.setCardStock(cardCouponVo.getCardStock()-1);
                       cardCoupon.setCardId(cardCouponVo.getCardId());
                       cardCouponServices.updateCardCoupon(cardCoupon);
                       return 1;
                   }else {
                       return "该卡劵已经不能再领了！";
                   }
               }else {
                   return "该卡劵已领完！";
               }
           }else {
               return "该卡券已无效！";
           }
       }catch (Exception ex){
           ex.printStackTrace();
           return "程序错误！";
       }
    }

    @Override
    public int findCount(String userId,String cardId) {
        return cardDetailMapper.findCount(userId,cardId);
    }

    @Override
    public List<CardDetailVo> findCardDetailByCardState(String userId,String cardState) {
        Map map=new HashMap();
        map.put("userId",userId);
        map.put("cardState",cardState);
        List<CardDetailVo> cardDetailVoList=cardDetailMapper.searchCardDetailByParams(map);
        return cardDetailVoList;
    }

    @Override
    public int findCardDetailCountByCardState(String userId, String cardState) {
        int count=cardDetailMapper.findCardDetailCountByCardStateAndUserId(userId,cardState);
        return count;
    }
}
