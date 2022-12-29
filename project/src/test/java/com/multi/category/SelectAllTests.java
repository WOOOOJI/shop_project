package com.multi.category;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Category;
import com.multi.service.CategoryService;

@SpringBootTest
class SelectAllTests {
	
	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		List<Category> objs=null;
		try {
			objs=service.get();
			for(Category c:objs) {
				System.out.println(c);
			}	
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAIL");
			e.printStackTrace();
		}
	}

}
