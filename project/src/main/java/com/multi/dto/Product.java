package com.multi.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	private int p_num;
	private int c_num;
	private String p_name;
	private String p_price;
	private String p_text;
	private LocalDateTime p_date;
	
	
	public Product(int c_num, String p_name, String p_price, String p_text) {
		super();
		this.c_num = c_num;
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_text = p_text;
	}
	
	
	
}
