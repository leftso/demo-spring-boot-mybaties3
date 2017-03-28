package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapper.UserMapper;
import com.example.pojo.User;

@RestController
public class UserController {

	@Autowired
	UserMapper userMapper;

	/**
	 * index
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "User Info By Mybaties";
	}

	@RequestMapping("/user/list.json")
	public Object allUsers() {
		List<User> users = userMapper.findList();
		return users;
	}

}
