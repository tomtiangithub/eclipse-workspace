package com.hti.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hti.entity.User;


@Mapper
public interface UserDao {

	public List<User> findByNameAndPassword(@Param("name") String name, @Param("password") String password);

	public User findById(Integer id);

}
