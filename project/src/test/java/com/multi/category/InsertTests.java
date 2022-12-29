package com.multi.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Category;
import com.multi.service.CategoryService;

@SpringBootTest
class InsertTests {
	
	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		Category obj=new Category(14,0,"가전제품");
		try {
			if(obj.getC_num2()==0) {
				service.register2(obj);
			}else{
				service.register(obj);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAIL");
			e.printStackTrace();
		}
	}

}
