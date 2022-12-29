package com.multi.product;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Product;
import com.multi.service.ProductService;

@SpringBootTest
class SelectAllTest {
	@Autowired
	ProductService service;
	
	
	@Test
	void contextLoads() {
		List<Product> list = null;
		
		try {
			list = service.get();
			for(Product p : list) System.out.println(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
