package com.myweb02.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.myweb02.dao.BaseDao;
import com.myweb02.dao.UserDao;
import com.myweb02.entity.User;
/**
 * 用户Dao实现
 * @author Administrator
 * @date 2016年5月8日	
 *
 */
public class UserDaoImpl extends BaseDao implements UserDao {
	
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public List<User> getUserList() {
		String hql = "from user";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

}
