package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.Category;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface CategoryMapper extends MyMapper<Integer, Category> {
	public void insert2(Category v) throws Exception;
	
	//USER ID 받아서 user_id, 상품이름, 카테고리 이름 출력
	public List<Category> getUserCat(String k) throws Exception;
}
