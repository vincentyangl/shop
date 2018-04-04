package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.ReturnOrder;
import com.mapper.ReturnOrderDao;

@Service
public class ReturnOrderServiceImpl implements ReturnOrderService{
	
	@Autowired
	private ReturnOrderDao returnOrderDao;
	@Override
	public List<ReturnOrder> listAll() {
		return returnOrderDao.listAll();
	}

	@Override
	public ReturnOrder getById(int retId) {
		return returnOrderDao.getById(retId);
	}

	@Override
	public void delete(int retId) {
		returnOrderDao.delete(retId);
	}

}
