package com.hzit.dao.services;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.CardCoupon;
import com.hzit.dao.entity.CardDetail;
import com.hzit.dao.vo.CardDetailVo;

import java.util.List;

/**
 * Created by Administrator on 2016/10/31.
 */
public interface CardDetailService {
    /**
     *
     * @param cardUuid 用户传入卡劵的业务ID
     * @param page  page代表用户传入的页数;
     * @param rowCount  rowCount代表每页要显示多少条数据;
     * @return  返回一个根据卡劵业务ID所找到的数据
     * 并进行封装过后可迭代的卡劵领取详情实体（CardCoupon）集合
     */
    Page<CardDetailVo> findDetailByCardId(String cardUuid,int page,int rowCount);

    /**
     * 根据用户Id查询卡劵领取详情
     * @param userId 用户ID
     * @return 卡劵领取详情的List集合
     */
    List<CardDetailVo> findDetailByUserId(String userId);

    /**
     * 增加领取详情
     * @param cardUuid  根据卡劵的业务ID来增加该卡劵对应的领取详情
     * @return  放回一个Object 数据类型！
     */
    Object addCardDetail(String cardUuid);

    /**
     * 查询当前用户领取该卡劵的次数
     * @param userId  用户ID
     * @param cardId  卡劵ID
     * @return  返回当前用户领取该卡劵的次数！
     */
    int findCount(String userId,String cardId);

    /**
     * 根据用户Id和卡劵状态来查询领取详情表
     * @param userId 用户ID
     * @param cardState  卡劵状态
     * @return  一个放有卡劵实体类的集合
     */
    List<CardDetailVo> findCardDetailByCardState(String userId,String cardState);

    /**
     * 查询当前用户可用的卡券数量
     * @param userId  传入userId
     * @param cardState 传入卡券状态
     * @return  返回一个总数！
     */
    int findCardDetailCountByCardState(String userId,String cardState);
}
