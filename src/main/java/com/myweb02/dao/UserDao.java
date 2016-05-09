package com.myweb02.dao;

import java.util.List;

import com.myweb02.entity.User;

/**
 * 用户Dao接口
 * @author Administrator
 * @date 2016年5月8日	
 *
 */
public interface UserDao {
	public void addUser(User user);

	public List<User> getUserList();
}
