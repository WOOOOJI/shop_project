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
public class Cart {
	private String id;
	private int p_num;
	private int cnt;
	
	
	//getCart Variable
	private int cart_num;
	private String p_name;
	private String p_price;
	private String user_id;
	
	
	// CRUD Constructor
	public Cart(String id, int p_num, int cnt) {
		super();
		this.id = id;
		this.p_num = p_num;
		this.cnt = cnt;
	}
}
