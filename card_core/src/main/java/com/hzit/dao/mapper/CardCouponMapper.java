package com.hzit.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.hzit.dao.entity.CardCoupon;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface CardCouponMapper {

	void insertCardCoupon(CardCoupon cardCoupon);

	void deleteCardCouponByCardId(Integer cardId);

	void updateCardCoupon(CardCoupon cardCoupon);

	Page<CardCoupon> searchCardCouponByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<CardCoupon> searchCardCouponByParams(@Param("map") Map<String, String> map);

} 
