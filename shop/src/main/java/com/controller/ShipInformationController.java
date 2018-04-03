package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.ShipInformation;
import com.service.ShipInformationService;

@Controller
@RequestMapping("/consignor")
public class ShipInformationController {

	@Autowired
	private ShipInformationService shipService;
	@RequestMapping("/listShipInformation")
	public ModelAndView listShipInformation() {
		ModelAndView mv = new ModelAndView();
		List<ShipInformation> list = shipService.listAll();
		mv.addObject("list", list);
		mv.setViewName("shipInformationList");
		return mv;
	}
	@RequestMapping("/getShipInformationById/{shipId}")
	public ModelAndView getById(@PathVariable("shipId")int shipId){
		ModelAndView mv = new ModelAndView();
		ShipInformation shipInformation = shipService.getById(shipId);
		mv.addObject("si", shipInformation);
		mv.setViewName("shipInformationEdit");
		return mv;
	}
	@RequestMapping("/updateById")
	public String updateById(ShipInformation shipInformation) {
		shipService.update(shipInformation);
		return "redirect:/consignor/listShipInformation";
	}
	@RequestMapping("/deleteShipInformationById/{shipId}")
	public String deleteById(@PathVariable("shipId")int shipId) {
		shipService.delete(shipId);
		return "redirect:/consignor/listShipInformation";
	}
	@RequestMapping("/saveShipInformation")
	public String save(ShipInformation shipInformation){
		shipService.save(shipInformation);
		return "redirect:/consignor/listShipInformation";
	}
}
