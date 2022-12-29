package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.Orderr;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface OrderrMapper extends MyMapper<Integer, Orderr> {

}
