package com.hti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hti.entity.User;
import com.hti.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/validate/{name}/{password}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public User validate(@PathVariable String name, @PathVariable String password) {
		return userService.queryByNameAndPassowrd(name, password).get(0);
	}
	
}
