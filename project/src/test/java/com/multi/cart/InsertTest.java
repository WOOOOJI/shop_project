package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Cart;
import com.multi.service.CartService;

@SpringBootTest
public class InsertTest {
	
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		Cart cart = new Cart("abc1234",1, 4);
		try {
			service.register(cart);
			System.out.println("Ok!!");
		} catch (Exception e) {
			System.out.println("Fail!!");
			e.printStackTrace();
		}
	}

}
