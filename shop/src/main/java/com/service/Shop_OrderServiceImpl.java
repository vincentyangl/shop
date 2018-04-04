package com.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Shop_Order;
import com.mapper.Shop_OrderMapper;

@Service
public class Shop_OrderServiceImpl implements Shop_OrderService{

	@Autowired
	private Shop_OrderMapper shop_OrderMapper;
	@Override
	public List<Shop_Order> listAll() {
		List<Shop_Order> list=shop_OrderMapper.listAll();
		return list;
	}
	@Override
	public void delete(int order_id) {
		shop_OrderMapper.delete(order_id);
		
	}
	@Override
	public Shop_Order getById(int order_id) {
		Shop_Order shop_Order=shop_OrderMapper.getById(order_id);
		return shop_Order;
	}
	@Override
	public void update(Shop_Order shop_Order) {
		shop_OrderMapper.update(shop_Order);
	}

}
