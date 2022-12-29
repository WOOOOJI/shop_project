package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Product;
import com.multi.service.ProductService;

@SpringBootTest
class SelectTest {
	@Autowired
	ProductService service;
	
	
	@Test
	void contextLoads() {
		Product p = new Product();
		
		try {
			p = service.get(1);
			System.out.println(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
