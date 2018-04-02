package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Permissions;
import com.bean.User;
import com.service.PermissionsService;
import com.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private PermissionsService permissionsService;
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("user_name") String user_name,
			@RequestParam("user_password") String user_password) {
		ModelAndView mv = new ModelAndView();
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
	            	mv.setViewName("/login");
	            	return mv;
	            }
	        }
		 mv.addObject("permissions", getPermissionsMenu());
		 mv.setViewName("/index");
		return mv;
	}
	
	public List<Permissions> getPermissionsMenu() {
		Map map = new HashMap<>();
		map.put("per_menu", 1);
		map.put("per_parentId", -1);
		List<Permissions> permissions = permissionsService.listAll(map);
		for (Permissions permissions2 : permissions) {
			System.out.println(permissions2.getPer_name()+"--------------");
			for (Permissions permissions3 : permissions2.getPers()) {
				System.out.println(permissions3.getPer_name()+"==========");
			}
		}
		return permissions;
	}
	
	@RequestMapping("/list")
	public ModelAndView userList() {
		ModelAndView mv = new ModelAndView();
		List<User> users = userService.listAll(new HashMap<>());
		mv.addObject("users", users);
		mv.setViewName("userList");
		return mv;
	}
	
	@RequestMapping("/delete/{user_id}")
	public String userDelete(@PathVariable("user_id") int user_id) {
		userService.delete(user_id);
		return "redirect:/user/list";
	}
	
}
