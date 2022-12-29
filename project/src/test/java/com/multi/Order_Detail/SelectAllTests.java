package com.multi.Order_Detail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Order_Detail;
import com.multi.service.Order_DetailService;

@SpringBootTest
class SelectAllTests {

	@Autowired
	Order_DetailService service;
	
	@Test
	void contextLoads() {
		List<Order_Detail> objs = null; 
		try {
			objs = service.get(); 
			for( Order_Detail obj : objs ) { 
				System.out.println(obj);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}

