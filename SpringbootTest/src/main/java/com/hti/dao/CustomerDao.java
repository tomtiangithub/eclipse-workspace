package com.hti.dao;

import org.apache.ibatis.annotations.Mapper;

import com.hti.entity.Customer;

@Mapper
public interface CustomerDao {

	public Customer queryByCid(Integer cid);

}
