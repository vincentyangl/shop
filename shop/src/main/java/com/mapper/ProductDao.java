package com.mapper;

import java.util.List;
import java.util.Map;

import com.bean.Product;

public interface ProductDao {

	public void save(Product product);
	public void delete(int pid);
	public void update(Product product);
	public List<Product> listAll(Map map);
	
}
