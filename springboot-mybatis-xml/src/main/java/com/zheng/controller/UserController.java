package com.zheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zheng.entity.User;
import com.zheng.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/add")
	public int addUser(User user) {
		return userService.addUser(user);
	}
	
	@RequestMapping(value = "/all/{pageNum}/{pageSize}")
	public Object findAllUser(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		return userService.findAllUser(pageNum, pageSize);
	}
}
