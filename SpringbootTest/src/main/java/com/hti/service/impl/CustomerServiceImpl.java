package com.hti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
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

}
