package com.hti.service;

import java.util.List;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hti.entity.Customer;

@FeignClient(name = "customer", url = "http://localhost:9000/customer")
public interface CustomerService {
	
	@RequestMapping(method = RequestMethod.GET, value = "/findall")
	public List<Customer> getCustomers();
	

	@RequestMapping(method = RequestMethod.POST, value = "/saveCustomer")
	public void saveCustomer(Customer customer);

}
