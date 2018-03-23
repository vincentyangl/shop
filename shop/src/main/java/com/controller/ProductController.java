package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Product;
import com.bean.ProductType;
import com.service.ProductService;
import com.service.ProductTypeService;

@Controller
@RequestMapping("/index")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/listProduct")
	public ModelAndView listProduct() {
		ModelAndView mv = new ModelAndView();
		List<Product> products = productService.listAll(new HashMap<>());
		mv.addObject("products", products);
		mv.setViewName("productList");
		return mv;
	}
	
	@RequestMapping("/deleteProduct/{pid}")
	public String deleteProduct(@PathVariable("pid") int pid) {
		productService.delete(pid);
		return "redirect:/index/listProduct";
	}
	
	@RequestMapping("/toUpdate/{pid}")
	public String toUpdate(@PathVariable("pid") int pid,Model model) {
		Map map = new HashMap<>();
		map.put("pid", pid);
		List<Product> products = productService.listAll(map);
		model.addAttribute("product", products.get(0));
		return "updateProduct";
	}
	
	@RequestMapping("/productUpdate")
	public String productUpdate(Product product,ProductType productType) {
		product.setProductType(productType);
		productService.update(product);
		return "redirect:listProduct";
	}
	
	@RequestMapping("/add")
	public String productAdd(Product product,ProductType productType) {
		product.setProductType(productType);
		productService.save(product);
		return "redirect:listProduct";
	}
	
}
