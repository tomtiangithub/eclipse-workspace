package com.hti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hti.dao.UserDao;
import com.hti.entity.User;
import com.hti.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> queryByNameAndPassowrd(String name, String password) {
		
		return userDao.findByNameAndPassword(name, password);
	}

	@Override
	public User queryById(Integer id) {
		
		return userDao.findById(id);
	}

}
