package com.multi.Orderr;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Order_Detail;
import com.multi.dto.Orderr;
import com.multi.service.Order_DetailService;
import com.multi.service.OrderrService;

@SpringBootTest
class SelectAllTests {

	@Autowired
	OrderrService service;
	
	@Test
	void contextLoads() {
		List<Orderr> objs = null; 
		try {
			objs = service.get(); 
			for( Orderr obj : objs ) { 
				System.out.println(obj);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}

