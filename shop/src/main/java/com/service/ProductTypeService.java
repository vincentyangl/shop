package com.service;

import java.util.List;

import com.bean.ProductType;

public interface ProductTypeService {

	public void save(ProductType productType);
	public void delete(int ptid);
	public void update(ProductType productType);
	public List<ProductType> listAll();
	public ProductType getById(int ptid);
	
}
