package com.myweb02.dao;

import org.hibernate.SessionFactory;

/**
 * Dao基类
 * @author Administrator
 *
 */
public class BaseDao {
	protected SessionFactory sessionFactory;

	/**
	 * 
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
