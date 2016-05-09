package com.myweb02.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 * 自定义监听器
 * @author Administrator
 * @date 2016年5月8日	
 *
 */
public class Myweb02Listener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("监听器初始化！");
		ServletContext context = sce.getServletContext();
		//BasicDataSource dataSource = new BasicDataSource();
		//dataSource.set
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("监听器销毁！");
	}

}
