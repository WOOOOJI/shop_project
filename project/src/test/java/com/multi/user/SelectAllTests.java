package com.multi.user;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.User;
import com.multi.service.UserService;

@SpringBootTest
class SelectAllTests {
	
	@Autowired
	UserService service;
	
	@Test
	void contextLoads() {
		List<User> objs=null;
		try {
			objs=service.get();
			for(User u:objs) {
				System.out.println(u);
			}	
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("FAIL");
			e.printStackTrace();
		}
	}

}
