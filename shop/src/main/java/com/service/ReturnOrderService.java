package com.service;

import java.util.List;

import com.bean.ReturnOrder;

public interface ReturnOrderService {

	public List<ReturnOrder> listAll();
	public ReturnOrder getById(int retId);
	public void delete(int retId);
}
