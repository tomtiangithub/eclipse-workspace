package com.hti.servicetest;

import com.hti.baseTest.SpringTestCase;
import com.hti.entity.Customer;
import com.hti.service.CustomerService;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceTest extends SpringTestCase {

	Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired  
    private CustomerService customerService; 
    @Test  
    public void selectUserByIdTest(){  
    	Customer customer=customerService.selectCustomerByCid(1001);
        logger.info("查找结果" + customer);  
    }  
}
