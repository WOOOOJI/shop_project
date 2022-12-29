package com.multi.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Category;
import com.multi.service.CategoryService;

@SpringBootTest
class UpdateTests {
	
	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		Category obj=new Category(14,10,"가전제품");
		try {
			service.modify(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAIL");
			e.printStackTrace();
		}
	}

}
