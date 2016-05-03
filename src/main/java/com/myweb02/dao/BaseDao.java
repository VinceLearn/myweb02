package com.myweb02.dao;

import org.hibernate.SessionFactory;

public class BaseDao {
	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
