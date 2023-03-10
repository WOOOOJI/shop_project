package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.Cart;
import com.multi.dto.Order_Detail;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface Order_DetailMapper extends MyMapper<Integer, Order_Detail> {
	public List<Order_Detail> selectdetail(String k) throws Exception;
}
