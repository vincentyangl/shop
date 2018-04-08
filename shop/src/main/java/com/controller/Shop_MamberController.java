package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Shop_Member;
import com.service.Shop_MemberService;

@Controller
@RequestMapping("member")
public class Shop_MamberController {

	@Autowired
	private Shop_MemberService shop_MamberService;
	@RequestMapping("/smindex")
	public ModelAndView listAll(HttpServletRequest request){
		ModelAndView mv=new ModelAndView();
		Map map=new HashMap();
		map=initMap(request, map);
		List<Shop_Member> list=shop_MamberService.listAll(map);
		System.out.println(list);
		mv.setViewName("smindex");
		mv.addObject("list", list);
		return mv;
	} 
	
	//·â×°map
	private Map initMap(HttpServletRequest request,Map map){
		String name=request.getParameter("member_username");
		System.out.println(name);
		map.put("name", name);
		if (name!=null) {
			request.setAttribute("name", name);
		}
		return map;
	}
	
	
	@RequestMapping("/smdelete")
	public String delete(int member_id,HttpServletRequest request){
		int a=Integer.parseInt(request.getParameter("member_id"));
		System.out.println(a);
		shop_MamberService.delete(member_id);
		return "redirect:smindex";
	}
	@RequestMapping("/smsave")
	public String save(Shop_Member shop_Member){
		shop_MamberService.save(shop_Member);
		return "redirect:smindex";
	}
	@RequestMapping("/smupdate")
	public String update(Shop_Member shop_Member){
		System.out.println(shop_Member.getMember_id());
		shop_MamberService.update(shop_Member);
		return "redirect:smindex";
	}
	@RequestMapping("/smgetById")
	public ModelAndView getById(int member_id,HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("member_id"));
		System.out.println(id);
		ModelAndView mv=new ModelAndView();
		Shop_Member shop_Member=shop_MamberService.getById(member_id);
		System.out.println(shop_Member);
		mv.setViewName("smupdate");
		mv.addObject("shop_Member", shop_Member);
		return mv;
	}
}
