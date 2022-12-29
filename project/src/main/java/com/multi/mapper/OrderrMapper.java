package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.Cart;
import com.multi.dto.Orderr;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface OrderrMapper extends MyMapper<Integer, Orderr> {

	//주문테이블에 id, 사용자이름, 결제수단, 주문날짜, 배송지주소를 선택
	public List<Orderr> getOrderr(String k) throws Exception;
}
