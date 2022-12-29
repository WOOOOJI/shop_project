package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.ProductService;

@SpringBootTest
class DeleteTest {
	@Autowired
	ProductService service;
	
	
	@Test
	void contextLoads() {
		
		try {
			service.remove(4);
			System.out.println("삭제 성공하였습니다");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
