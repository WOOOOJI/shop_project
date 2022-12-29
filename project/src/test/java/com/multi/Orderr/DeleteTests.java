package com.multi.Orderr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.Order_DetailService;
import com.multi.service.OrderrService;

@SpringBootTest
class DeleteTests {

	@Autowired
	OrderrService service;
	
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

