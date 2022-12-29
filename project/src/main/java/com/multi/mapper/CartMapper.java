package com.multi.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.Cart;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface CartMapper extends MyMapper<Integer, Cart> {

	// abc1234회원이 장바구니에 넣은 상품의 장바구니 번호, 상품명, 상품 가격, 총수량 를 선택하세요!
	public List<Cart> getCart(String k) throws Exception;

}