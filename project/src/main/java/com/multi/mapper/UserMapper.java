package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.User;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface UserMapper extends MyMapper<String, User>{

}
