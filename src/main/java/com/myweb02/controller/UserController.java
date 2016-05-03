package com.myweb02.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myweb02.entity.User;
import com.myweb02.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/toAddUser")
	public String toadd(){
		System.out.println("ToAddUser" + new Date());
		return "/user/addUser";
	}
	
	@RequestMapping("/addUser")
	public String addUser(User user, HttpServletRequest request){
		System.out.println("用户名:" + user.getUsername());
		user.setId("10000001");
		userService.addUser(user);
		return "redirect:/user/toAddUser";
	}
	
	public String getList(){
		List<User> users = userService.getUserList();
		return "/user/list";
	}
}
