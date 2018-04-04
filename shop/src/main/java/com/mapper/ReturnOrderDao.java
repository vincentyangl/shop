package com.mapper;

import java.util.List;

import com.bean.ReturnOrder;

public interface ReturnOrderDao {

	public List<ReturnOrder> listAll();
	public ReturnOrder getById(int retId);
	public void delete(int retId);
}
