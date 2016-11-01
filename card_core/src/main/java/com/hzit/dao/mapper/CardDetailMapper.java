package com.hzit.dao.mapper;

import java.util.List;
import java.util.Map;

import com.hzit.dao.vo.CardDetailVo;
import org.apache.ibatis.annotations.Param;
import com.hzit.dao.entity.CardDetail;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface CardDetailMapper {

	void insertCardDetail(CardDetail cardDetail);

	void deleteCardDetailByCardDetailId(Integer cardDetailId);

	void updateCardDetail(CardDetail cardDetail);

	Page<CardDetailVo> searchCardDetailByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<CardDetailVo> searchCardDetailByParams(@Param("map") Map<String, String> map);
	Integer findCount(@Param("userId")String userId,@Param("cardId")String cardId);

} 
