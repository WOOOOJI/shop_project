package com.multi.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.CategoryService;

@SpringBootTest
class DeleteTests {
	
	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		
		try {
			service.remove(14);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAIL");
			e.printStackTrace();
		}
	}

}
