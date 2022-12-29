package com.multi.category;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Category;
import com.multi.service.CategoryService;

@SpringBootTest
class GetUserCatTests {
	
	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		List<Category> objs=null;
		try {
			objs=service.getUserCat("abc5678");
			for(Category obj:objs) {
				System.out.println(obj);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAIL");
			e.printStackTrace();
		}
	}

}
