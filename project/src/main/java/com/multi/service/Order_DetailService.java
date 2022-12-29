package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.Order_Detail;
import com.multi.frame.MyService;
import com.multi.mapper.Order_DetailMapper;

@Service
public class Order_DetailService implements MyService<Integer, Order_Detail>{

	@Autowired
	Order_DetailMapper mapper;
	
	@Override
	public void register(Order_Detail v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(Order_Detail v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public Order_Detail get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Order_Detail> get() throws Exception {
		return mapper.selectall();
	}

}
