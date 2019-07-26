package com.hti.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hti.entity.Customer;
import com.hti.service.CustomerService;

@RestController
public class CustomerController {

  @Autowired
  private CustomerService customerService;	
	
  @RequestMapping(value = "/getCustomerByCid", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
  public Customer getCustomerByCid(@PathVariable Integer cid) {
	  return customerService.selectCustomerByCid(cid);
  }	
  
  @RequestMapping(value = "/findall", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Customer> findAll(){
	 List<Customer> customers =customerService.findAll();
	 return customers;
  }
  

  @RequestMapping(value={"/saveCustomer"}, method=RequestMethod.POST, 
	consumes = MediaType.APPLICATION_JSON_VALUE)  
  public void saveCustomer(@RequestBody Customer customer){
	  customerService.saveCustomer(customer);
  }

}
