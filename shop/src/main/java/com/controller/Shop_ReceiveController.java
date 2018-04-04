package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Shop_Receive;
import com.service.Shop_ReceiveService;

@Controller
public class Shop_ReceiveController {
	@Autowired
	private Shop_ReceiveService shop_ReceiveService;
	@RequestMapping("/soindex")
	public ModelAndView listAll(){
		System.out.println("12345");
		ModelAndView mv=new ModelAndView();
		List<Shop_Receive> list=shop_ReceiveService.listAll();
		mv.setViewName("soindex");
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping("/sodelete")
	public String delete(int receive_id,HttpServletRequest request){
		int a=Integer.parseInt(request.getParameter("receive_id"));
		System.out.println(a);
		shop_ReceiveService.delete(receive_id);
		return "redirect:soindex";
	}
	@RequestMapping("/sosave")
	public String save(Shop_Receive shop_Receive){
		shop_ReceiveService.save(shop_Receive);
		return "redirect:soindex";
	}
	@RequestMapping("/soupdate")
	public String update(Shop_Receive shop_Receive){
//		System.out.println(shop_Receive.getMember_id());
		shop_ReceiveService.update(shop_Receive);
		return "redirect:soindex";
	}
	@RequestMapping("/getById")
	public ModelAndView getById(int receive_id,HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("receive_id"));
		System.out.println(id);
		ModelAndView mv=new ModelAndView();
		Shop_Receive shop_Receive=shop_ReceiveService.getById(receive_id);
		System.out.println(shop_Receive);
		mv.setViewName("soupdate");
		mv.addObject("shop_Receive", shop_Receive);
		return mv;
	}
}
