package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Cart;
import com.multi.service.CartService;

@SpringBootTest
public class SelectTest {
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		Cart cart = null;
		try {
			cart = service.get(1);
			System.out.println(cart);
			System.out.println("Ok!!");
		} catch (Exception e) {
			System.out.println("Fail!!");
			e.printStackTrace();
		}
	}
}