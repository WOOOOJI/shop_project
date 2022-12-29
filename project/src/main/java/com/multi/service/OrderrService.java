package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.Orderr;
import com.multi.frame.MyService;
import com.multi.mapper.OrderrMapper;

@Service
public class OrderrService implements MyService<Integer, Orderr>{

	@Autowired
	OrderrMapper mapper;
	
	@Override
	public void register(Orderr v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(Orderr v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public Orderr get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Orderr> get() throws Exception {
		return mapper.selectall();
	}

}
