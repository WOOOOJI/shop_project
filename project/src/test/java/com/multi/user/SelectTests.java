package com.multi.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.User;
import com.multi.service.UserService;

@SpringBootTest
class SelectTests {
	
	@Autowired
	UserService service;
	

	@Test
	void contextLoads() {
		User obj=null;
		try {
			obj=service.get("ccc");
			System.out.println(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAIL");
			e.printStackTrace();
		}
	}


}
