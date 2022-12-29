package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.Category;
import com.multi.frame.MyService;
import com.multi.mapper.CategoryMapper;

@Service
public class CategoryService implements MyService<Integer, Category>{

	@Autowired
	CategoryMapper mapper;
	
	@Override
	public void register(Category v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(Category v) throws Exception {
		mapper.update(v);
	}

	@Override
	public Category get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Category> get() throws Exception {
		return mapper.selectall();
	}
	
	public void register2(Category v) throws Exception{
		mapper.insert2(v);
	}
	
	//USER ID 받아서 user_id, 상품이름, 카테고리 이름 출력
	public List<Category> getUserCat(String k) throws Exception{
		return mapper.getUserCat(k);
	}

}
