package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.PermissionsService;

@RequestMapping("/per")
@Controller
public class PermissionsController {

	@Autowired
	private PermissionsService permissionsService;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
