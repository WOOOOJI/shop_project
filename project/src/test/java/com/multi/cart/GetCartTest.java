package com.multi.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Cart;
import com.multi.service.CartService;

@SpringBootTest
public class GetCartTest {
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		try {
			List<Cart> list = null;
			list = service.getCart("abc5678");
			for(Cart c : list) System.out.println(c);
			System.out.println("사용자 장바구니 조회 성공");
		} catch (Exception e) {
			System.out.println("Fail!!");
			e.printStackTrace();
		}
	}

}