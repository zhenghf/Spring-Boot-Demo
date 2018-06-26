package com.zheng.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.zheng.entity.User;
import com.zheng.mapper.UserMapper;
import com.zheng.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int addUser(User user) {
		return userMapper.insertSelective(user);
	}
	
	@Override
	public List<User> findAllUser(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return userMapper.selectAllUser();
	}
}
