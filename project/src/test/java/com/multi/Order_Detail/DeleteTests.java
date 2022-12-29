package com.multi.Order_Detail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.Order_DetailService;

@SpringBootTest
class DeleteTests {

	@Autowired
	Order_DetailService service;
	
	@Test
	void contextLoads() { 
		try {
			service.remove(3);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}

