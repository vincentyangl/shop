package com.controller;

import java.util.HashMap;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Shop_Order;
import com.bean.Shop_Receive;
import com.service.Shop_OrderService;
import com.service.Shop_ReceiveService;

@Controller
@RequestMapping("order")
public class Shop_OrderController {
	@Autowired
	private Shop_OrderService shop_OrderService;
	@Autowired
	private Shop_ReceiveService Shop_ReceiveService;
	@RequestMapping("/soindex")
	public ModelAndView list(HttpServletRequest request){
		ModelAndView mv=new ModelAndView();
		Map map=new HashMap();
		map=initMap(request, map);
		List<Shop_Order> list=shop_OrderService.listAll(map);
		System.out.println(list);
		mv.setViewName("soindex");
		mv.addObject("list", list);
		return mv;
	}
	
	
	//·â×°map
	private Map initMap(HttpServletRequest request,Map map){
		String name=request.getParameter("order_code");
		System.out.println(name);
		map.put("name", name);
		if (name!=null) {
			request.setAttribute("name", name);
		}
		return map;
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
		System.out.println(shop_Order.getReceive_ids());
		mv.addObject("shop_Order", shop_Order);
		System.out.println(shop_Order);
		return mv;
	}
	
	
	
	@RequestMapping("/soupdate")
	public String update(Shop_Receive shop,HttpServletRequest request) {
		Shop_Order shop_Order4=shop_OrderService.getById(Integer.parseInt(request.getParameter("order_id")));
		shop.setReceive_id(shop_Order4.getReceive_ids().getReceive_id());
		Shop_ReceiveService.update(shop);
		return "redirect:soindex";
	}
}
