package com.multi.Order_Detail;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Order_Detail;
import com.multi.service.Order_DetailService;

@SpringBootTest
class SelectTests {

	@Autowired
	Order_DetailService service;
	
	@Test
	void contextLoads() {
		Order_Detail obj = null; //받을준비
		try {
			obj = service.get(2);
			System.out.println(obj); 
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}

