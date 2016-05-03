package com.myweb02.dao;

import java.util.List;

import com.myweb02.entity.User;

public interface UserDao {
	public void addUser(User user);

	public List<User> getUserList();
}
