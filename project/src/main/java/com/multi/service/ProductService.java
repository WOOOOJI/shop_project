package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.Product;
import com.multi.frame.MyService;
import com.multi.mapper.ProductMapper;

@Service
public class ProductService implements MyService<Integer, Product>{
	@Autowired
	ProductMapper mapper;

	@Override
	public void register(Product v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(Product v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public Product get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Product> get() throws Exception {
		return mapper.selectall();
	}
	
	
}
