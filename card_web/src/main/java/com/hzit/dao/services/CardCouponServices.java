package com.hzit.dao.services;

import com.fc.platform.commons.page.Page;
import com.hzit.dao.entity.CardCoupon;


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
    Page<CardCoupon> findByPages(int page,int rowCount);
}
