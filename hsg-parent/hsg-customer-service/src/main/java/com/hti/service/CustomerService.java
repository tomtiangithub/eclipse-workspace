package com.hti.service;

import java.util.List;


import com.hti.entity.Customer;

public interface CustomerService {

	public Customer selectCustomerByCid(Integer cid);
	public List<Customer> findAll();
	public void saveCustomer(Customer custoer);
}
