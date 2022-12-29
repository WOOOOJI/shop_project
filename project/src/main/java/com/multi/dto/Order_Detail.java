package com.multi.dto;

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
public class Order_Detail {
	private int od_num;
	private int order_num;
	private int p_num;
	private int cnt;
	
	//Variant for CRUD
	private String p_name;
	private int total_price;
	private String order_id;
	
	//update (주문상세번호(od_num)이 있으면 수량(cnt)를 바꾸도록)
	public Order_Detail(int od_num, int cnt) {
		this.od_num = od_num;
		this.cnt = cnt;
	}

	public Order_Detail(int od_num, int order_num, int p_num, int cnt) {
		super();
		this.od_num = od_num;
		this.order_num = order_num;
		this.p_num = p_num;
		this.cnt = cnt;
	}

	
	
	

}
