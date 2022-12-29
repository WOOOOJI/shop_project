package com.multi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Category {
	private int c_num;
	private int c_num2;
	private String c_name;
	
	
	//getUserCat Variable
	private String user_id;
	private String p_name;
	
	//CRUD Variable
	public Category(int c_num, int c_num2, String c_name) {
		super();
		this.c_num = c_num;
		this.c_num2 = c_num2;
		this.c_name = c_name;
	}
}
