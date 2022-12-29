package com.multi.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Cart;
import com.multi.service.CartService;

@SpringBootTest
public class SelectAllTest {
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		List<Cart> carts = null;
		try {
			carts = service.get();
			for(Cart c : carts) {
				System.out.println(c);
			}
			System.out.println("Ok!!");
		} catch (Exception e) {
			System.out.println("Fail!!");
			e.printStackTrace();
		}
	}
}