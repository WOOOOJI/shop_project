package com.multi.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.User;
import com.multi.service.UserService;

@SpringBootTest
class UpdateTests {
	
	@Autowired
	UserService service;
	
	@Test
	void contextLoads() {
		User obj=new User("ccc", "tt11", "나비");
		try {
			service.modify(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAIL");
			e.printStackTrace();
		}
	}

}
