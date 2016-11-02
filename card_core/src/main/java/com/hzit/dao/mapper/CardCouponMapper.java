package com.hzit.dao.mapper;

import java.util.List;
import java.util.Map;

import com.hzit.dao.vo.CardCouponVo;
import org.apache.ibatis.annotations.Param;
import com.hzit.dao.entity.CardCoupon;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface CardCouponMapper {

	void insertCardCoupon(CardCoupon cardCoupon);

	void deleteCardCouponByCardId(Integer cardId);

	void updateCardCoupon(CardCoupon cardCoupon);

	Page<CardCouponVo> searchCardCouponByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<CardCouponVo> searchCardCouponByParams(@Param("map") Map<String, String> map);
	List<CardCouponVo> searchCardCouponByLike(@Param("cardName") String cardName);
} 
