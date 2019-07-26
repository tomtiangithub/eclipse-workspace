package com.hti.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hti.entity.Customer;
import com.hti.service.CustomerService;

@Controller
@RequestMapping("/customer-web")
public class CustomerWebController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/customer/list")
	public String listBook(Model model, HttpServletRequest request) {
		List<Customer> customers = customerService.getCustomers();
		// 写到临时文件中
		/*
		 * for (Book book : books) { String coverUrl = ImageUtil.writeToImage(book,
		 * request); book.setCoverUrl(coverUrl); }
		 */
		model.addAttribute("customers", customers);
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/saveCustomer")
	public void saveCustomer(Customer customer) {
		
		customerService.saveCustomer(customer);
	}
	
	
	
	
}
