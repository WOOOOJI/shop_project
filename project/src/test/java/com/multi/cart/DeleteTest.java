package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.CartService;

@SpringBootTest
public class DeleteTest {
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(3);
			System.out.println("Ok!!");
		} catch (Exception e) {
			System.out.println("Fail!!");
			e.printStackTrace();
		}
	}

}