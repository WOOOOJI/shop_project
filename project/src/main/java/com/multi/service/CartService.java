package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.Cart;
import com.multi.frame.MyService;
import com.multi.mapper.CartMapper;

@Service
public class CartService implements MyService<Integer, Cart>{

	@Autowired
	CartMapper mapper;
	
	@Override
	public void register(Cart v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(Cart v) throws Exception {
		mapper.update(v);
	}

	@Override
	public Cart get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Cart> get() throws Exception {
		return mapper.selectall();
	}
	
	//회원이 장바구니에 넣은 상품의 장바구니 번호, 상품명, 상품 가격, 총수량을 선택해주는 메소드
	public List<Cart> getCart(String k) throws Exception{
		return mapper.getCart(k);
	}
	
	// 회원이 카트에 담은 물품의 물품별 총액 구하기 (회원이름, 상품명, 상품개수, 총액)
	public List<Cart> getProductSum(String k) throws Exception{
		return mapper.getProductSum(k);
	}
}
