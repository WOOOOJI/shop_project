package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Product;
import com.multi.service.ProductService;

@SpringBootTest
class UpdateTest {
	@Autowired
	ProductService service;
	
	
	@Test
	void contextLoads() {
		Product p = new Product(5, 12, "통닭", "20000", "이거슨 치킨인가 통닭인가...",null);
		
		try {
			service.modify(p);
			System.out.println("성공하였습니다");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
