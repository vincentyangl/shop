package com.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/login")
	public String login(@RequestParam("user_name") String user_name,
			@RequestParam("user_password") String user_password) {
		Subject currentUser = SecurityUtils.getSubject();
		 if (!currentUser.isAuthenticated()) {
			     System.out.println(13213);
	        	//把用户名和密码封装为 UsernamePasswordToken 对象
	            UsernamePasswordToken token = new UsernamePasswordToken(user_name, user_password);
	            System.out.println("uuuu");
	            //RememberMe
	            token.setRememberMe(true);
	            try {
	            	//调用subject的login 方法登陆
	                currentUser.login(token);
	            } 
	            //所有认证时异常的父类
	            catch (AuthenticationException ae) {
	            	System.out.println("login failed！"+ae.getMessage());
	            	return "/login";
	            }
	        }
		return "/index";
	}
	
}
