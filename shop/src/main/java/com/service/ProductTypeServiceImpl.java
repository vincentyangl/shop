package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.ProductType;
import com.mapper.ProductTypeDao;
@Service
public class ProductTypeServiceImpl implements ProductTypeService{

	@Autowired
	private ProductTypeDao productTypeDao;
	
	@Override
	public void save(ProductType productType) {
		productTypeDao.save(productType);
	}

	@Override
	public void delete(int ptid) {
		productTypeDao.delete(ptid);
	}

	@Override
	public void update(ProductType productType) {
		productTypeDao.update(productType);
	}

	@Override
	public List<ProductType> listAll() {
		List<ProductType> productTypes = productTypeDao.listAll();
		return productTypes;
	}

	@Override
	public ProductType getById(int ptid) {
		ProductType productType = productTypeDao.getById(ptid);
		return productType;
	}

}
