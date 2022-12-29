package com.multi.Orderr;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Cart;
import com.multi.dto.Orderr;
import com.multi.service.CartService;
import com.multi.service.OrderrService;

@SpringBootTest
public class GetOrderrTest {
	@Autowired
	OrderrService service;
	
	@Test
	void contextLoads() {
		try {
			List<Orderr> list = null;
			list = service.getOrderr("abc5678");
			for(Orderr c : list) System.out.println(c);
			System.out.println("사용자 주문 조회 성공");
		} catch (Exception e) {
			System.out.println("Fail!!");
			e.printStackTrace();
		}
	}

}