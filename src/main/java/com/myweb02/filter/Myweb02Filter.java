package com.myweb02.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义过滤器
 * 
 * @author Administrator
 * @date 2016年5月8日
 * @description 过滤字符编码，做一些应用逻辑判断。Filter跟web应用一起启动，当web应用重新启动或销毁时，Filter也被销毁。
 *
 */
public class Myweb02Filter implements Filter {

	private FilterConfig config = null;

	@Override
	public void destroy() {
		System.out.println("过滤器销毁。");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter.");
		// 类型转换
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		// 获取web.xml设置的编码集,设置到request和response上
		// request.setCharacterEncoding();
		request.setCharacterEncoding(config.getInitParameter("charset"));
		response.setContentType(config.getInitParameter("contentType"));
		response.setCharacterEncoding(config.getInitParameter("charset"));
		// 将请求转发到目的地
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		this.config = arg0;
		System.out.println("过滤器初始化。");
	}

}
