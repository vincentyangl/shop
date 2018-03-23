package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.ProductType;
import com.service.ProductTypeService;

@Controller
@RequestMapping("/type")
public class ProductTypeController {

	@Autowired
	private ProductTypeService productTypeService;
	
	@RequestMapping("/listProductType")
	@ResponseBody
	public List<ProductType> listProductType() {
		List<ProductType> productTypes = productTypeService.listAll();
		return productTypes;
	}
	
}
