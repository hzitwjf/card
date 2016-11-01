package com.hzit.dao.services;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.CardCoupon;
import com.hzit.dao.vo.CardCouponVo;


/**
 * Created by Administrator on 2016/10/29.
 */
public interface CardCouponServices {
    /**
     * 分页查询卡劵列表
     * @param page page代表用户传入的页数;
     * @param rowCount rowCount代表每页要显示多少条数据;
     * @return  返回一个封装过后可迭代的卡劵实体（CardCoupon）集合
     */
    Page<CardCouponVo> findByPages(int page,int rowCount);

    /**
     * 根据卡劵业务Id查询卡劵详细信息
     * @param cardUuid  卡劵yewuID
     * @return  返回卡劵实体对象
     */
    CardCouponVo findOneCardCoupon(String cardUuid);

    /**
     * 根据卡劵实体对象修改卡劵表
     * @param cardCoupon  卡劵实体类
     * @return  返回int类型数据 1代表成功，0代表失败；
     */
    int updateCardCoupon(CardCoupon cardCoupon);

}
