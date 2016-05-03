package com.myweb02.service;

import java.util.List;

import com.myweb02.entity.User;

public interface UserService {
	public void addUser(User user);
	public List<User> getUserList();
}
