package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Shop_Order;
import com.service.Shop_OrderService;

@Controller
@RequestMapping("order")
public class Shop_OrderController {
	@Autowired
	private Shop_OrderService shop_OrderService;
	@RequestMapping("/soindex")
	public ModelAndView list(){
		ModelAndView mv=new ModelAndView();
		List<Shop_Order> list=shop_OrderService.listAll();
		System.out.println(list);
		mv.setViewName("soindex");
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping("/sodelete")
	public String delete(int order_id,HttpServletRequest request) {
		int orderid=Integer.parseInt(request.getParameter("order_id"));
		System.out.println(orderid);
		shop_OrderService.delete(order_id);
		return "redirect:soindex";
	}
	
	@RequestMapping("/sogetById")
	public ModelAndView getById(int order_id,HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("order_id"));
		System.out.println(id);
		ModelAndView mv = new ModelAndView();
		Shop_Order shop_Order=shop_OrderService.getById(order_id);
		mv.setViewName("soupdate");
		mv.addObject("shop_Order", shop_Order);
		return mv;
	}
	
	@RequestMapping("/soupdate")
	public String update(Shop_Order shop_Order) {
		shop_OrderService.update(shop_Order);
		return "redirect:soindex";
	}
}
