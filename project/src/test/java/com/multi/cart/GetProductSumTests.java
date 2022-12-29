package com.multi.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Cart;
import com.multi.service.CartService;

@SpringBootTest
public class GetProductSumTests {
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		int tt=0;
		try {
			List<Cart> list = null;
			list = service.getProductSum("abc1234");
			for(Cart c : list) {
				System.out.println(c);
				tt+=c.getTotal();
			}
			System.out.println("total: "+tt);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail!!");
			e.printStackTrace();
		}
	}

}