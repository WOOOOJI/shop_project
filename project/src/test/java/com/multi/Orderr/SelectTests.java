package com.multi.Orderr;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Order_Detail;
import com.multi.dto.Orderr;
import com.multi.service.Order_DetailService;
import com.multi.service.OrderrService;

@SpringBootTest
class SelectTests {

	@Autowired
	OrderrService service;
	
	@Test
	void contextLoads() {
		Orderr obj = null; //받을준비
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

