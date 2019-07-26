package com.hti.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hti.entity.User;

@FeignClient(name = "user", url = "http://localhost:9000/user")
public interface UserService {
	@RequestMapping(method = RequestMethod.GET, value = "/validate/{name}/{password}")
	public User validate(@PathVariable("name") String name,@PathVariable("password") String password);
}
