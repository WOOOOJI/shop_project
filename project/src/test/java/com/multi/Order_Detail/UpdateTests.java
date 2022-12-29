package com.multi.Order_Detail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Order_Detail;
import com.multi.service.Order_DetailService;


@SpringBootTest
class UpdateTests {

	@Autowired
	Order_DetailService service;
	
	@Test
	void contextLoads() { //수정할때는 id값과 수량만 넣어주면 됨
		Order_Detail obj = new Order_Detail(2, 5);
		try {
			service.modify(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
