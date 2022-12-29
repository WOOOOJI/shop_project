package com.multi.Orderr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Order_Detail;
import com.multi.dto.Orderr;
import com.multi.service.Order_DetailService;
import com.multi.service.OrderrService;

@SpringBootTest
class InsertTests {

	@Autowired
	OrderrService service;

	@Test
	void contextLoads() {
		Orderr obj = new Orderr(3, "abc1234", "무통장입금", null ,"서울특별시 송파구");
		try {
			service.register(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}