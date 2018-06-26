package com.zheng.service;

import java.util.List;
import com.zheng.entity.User;

public interface UserService {
	int addUser(User user);
	List<User> findAllUser(int pageNum, int pageSize);
}
