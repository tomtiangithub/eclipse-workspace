package com.hti.service;

import java.util.List;

import com.hti.entity.User;

public interface UserService {

	public List<User> queryByNameAndPassowrd(String name, String password);
	public User queryById(Integer id);
}
