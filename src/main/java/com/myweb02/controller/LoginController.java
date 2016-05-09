package com.myweb02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 登录页面
 * @author Administrator
 * @date 2016年5月8日	
 *
 */
@Controller
@RequestMapping(value = "/")
public class LoginController {
	
	@RequestMapping(value = "/login")
	public String toLogin(){
		System.out.println("Login!!!");
		return "/login/login";
	}
	
	
	public String login(){
		return "/";
	}
}
