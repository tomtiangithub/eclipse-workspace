package com.hti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hti.dao.CustomerDao;
import com.hti.entity.Customer;
import com.hti.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public Customer selectCustomerByCid(Integer cid) {
		return customerDao.queryByCid(cid);
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = customerDao.findAll();
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

}
