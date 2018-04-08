package com.service;

import java.util.List;
import java.util.Map;

import com.bean.Shop_Order;
import com.bean.Shop_Receive;

public interface Shop_OrderService {
	public List<Shop_Order> listAll(Map map);
	public void delete(int order_id);
	public Shop_Order getById(int order_id);
	public void update(Shop_Order shop_Receive);
}
