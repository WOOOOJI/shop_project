package com.multi.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Orderr {
	private int order_num;
	private String id;
	private String method_payment;
	private LocalDateTime rdate;
	private String detailaddr;
	
	
	//getOrderr
	private String name;
	
	//insert (name제외)
	public Orderr(int order_num, String id, String method_payment, LocalDateTime rdate, String detailaddr) {
		this.order_num = order_num;
		this.id = id;
		this.method_payment = method_payment;
		this.rdate = rdate;
		this.detailaddr = detailaddr;
	}
	
	
	//update (주문상세번호(order_num)이 있으면 주소(detailaddr)를 바꾸도록)
	public Orderr(int order_num, String detailaddr) {
		this.order_num = order_num;
		this.detailaddr = detailaddr;
	}

	
}
