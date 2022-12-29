package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.springframework.stereotype.Repository;

import com.multi.dto.Product;
import com.multi.frame.MyMapper;

@Mapper
@Repository
public interface ProductMapper extends MyMapper<Integer,Product>{

}
