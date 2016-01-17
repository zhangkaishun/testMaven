package com.zhangkaishun.user.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhangkaishun.user.domain.User;
import com.zhangkaishun.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/get")
	public ModelAndView getUser(HttpServletResponse response) {
		User user=userService.getById(1);
		System.out.println(user);
		System.out.println("111");
		return null;
	}
}
