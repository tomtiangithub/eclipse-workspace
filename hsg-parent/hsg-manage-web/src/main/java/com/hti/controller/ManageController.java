package com.hti.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.hti.entity.Customer;
import com.hti.entity.User;
import com.hti.service.CustomerService;
import com.hti.service.UserService;

@Controller
@RequestMapping("/manage-web")
public class ManageController {
	@Autowired
	private UserService userService;

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/login")
	public String login(@ModelAttribute User loginUser, Model model, HttpSession session) {
		if (loginUser.getName() == null) {
			return "login";
		}
		// 调用验证服务
		User dataUser = userService.validate(loginUser.getName(), loginUser.getPassword());
		if (dataUser.getId() == null) {
			// 验证失败
			model.addAttribute("message", "fail");
			return "login";
		} else {
			session.setAttribute("manage-user", loginUser);
			return "index";
		}
	}

	@RequestMapping(value = "/customer/add")
	public String addCustomer() {
		return "customer/add";

	}
	
	@RequestMapping(value = "/customer/saveCustomer")
	public String saveBook(@ModelAttribute Customer customer, MultipartFile file)
			throws Exception {
		//book.setCover(file.getBytes());
		// 保存数据
		customerService.saveCustomer(customer);;
		return "forward:/manage-web/customer/list";
	}
	

	@RequestMapping(value = "/customer/list")
	public String listBook(Model model, HttpServletRequest request) {
		List<Customer> customers = customerService.getCustomers();

		// 写到临时文件中
		/*
		 * for (Book book : books) { String coverUrl = ImageUtil.writeToImage(book,
		 * request); book.setCoverUrl(coverUrl); }
		 */
		model.addAttribute("customers", customers);
		return "customer/list";
	}

	@RequestMapping(value = "/staticPage/{name}")
	public String staticPage(@PathVariable String name) {
		return name;
	}

}
