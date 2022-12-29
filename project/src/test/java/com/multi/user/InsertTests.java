package com.multi.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.User;
import com.multi.service.UserService;

@SpringBootTest
class InsertTests {
	
	@Autowired
	UserService service;
	
	@Test
	void contextLoads() {
		User obj=new User("ccc","er34","이순신","234567-3456789");
		try {
			service.register(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAIL");
			e.printStackTrace();
		}
	}

}
