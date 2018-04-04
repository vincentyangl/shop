package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.ReturnOrder;
import com.service.ReturnOrderService;

@Controller
@RequestMapping("/returnOrder")
public class ReturnOrderController {

	@Autowired
	private ReturnOrderService returnOrderService;
	@RequestMapping("/listReturnOrder")
	public ModelAndView listReturnOrder(){
		ModelAndView mv = new ModelAndView();
		List<ReturnOrder> list = returnOrderService.listAll();
		mv.addObject("list", list);
		mv.setViewName("refundList");
		return mv;
	}
	@RequestMapping("/getById/{retId}")
	public ModelAndView getById(@PathVariable("retId")int retId){
		ModelAndView mv = new ModelAndView();
		ReturnOrder returnOrder = returnOrderService.getById(retId);
		mv.addObject("returnOrder", returnOrder);
		mv.setViewName("refundDetails");
		return mv;
	}
}
