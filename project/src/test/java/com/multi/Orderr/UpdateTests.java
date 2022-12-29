package com.multi.Orderr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Order_Detail;
import com.multi.dto.Orderr;
import com.multi.service.Order_DetailService;
import com.multi.service.OrderrService;


@SpringBootTest
class UpdateTests {

	@Autowired
	OrderrService service;
	
	@Test
	void contextLoads() { //수정할때는 id값과 주소만 넣어주면 됨
		Orderr obj = new Orderr(1, "서울특별시 강남구");
		try {
			service.modify(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
