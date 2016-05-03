package com.myweb02.service.impl;

import java.util.List;

import com.myweb02.dao.UserDao;
import com.myweb02.entity.User;
import com.myweb02.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user) {
		userDao.addUser(user);
	}

	public List<User> getUserList() {
		return userDao.getUserList();
	}

}
