package com.multi.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.Cart;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface CartMapper extends MyMapper<Integer, Cart> {

	// 회원이 장바구니에 넣은 상품의 장바구니 번호, 상품명, 상품 가격, 총수량 를 선택하세요!
	public List<Cart> getCart(String k) throws Exception;
	
	// 회원이 카트에 담은 물품의 물품별 총액 구하기 (회원이름, 상품명, 상품개수, 총액)
	public List<Cart> getProductSum(String k) throws Exception;

}