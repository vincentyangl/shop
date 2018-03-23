package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.mapper.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	
	@Override
	public void save(Product product) {
		productDao.save(product);
	}

	@Override
	public void delete(int pid) {
		productDao.delete(pid);
	}

	@Override
	public void update(Product product) {
		productDao.update(product);
	}

	@Override
	public List<Product> listAll(Map map) {
		List<Product> products = productDao.listAll(map);
		return products;
	}

}
