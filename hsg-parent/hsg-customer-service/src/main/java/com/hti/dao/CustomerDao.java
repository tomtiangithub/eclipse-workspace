package com.hti.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.hti.entity.Customer;

@Mapper
public interface CustomerDao {

	public Customer queryByCid(Integer cid);

	public List<Customer> findAll();
	
	public void addCustomer(Customer customer);
}
