package com.mapper;

import java.util.List;

import com.bean.Shop_Order;

public interface Shop_OrderMapper {
public List<Shop_Order> listAll();
public void delete(int order_id);
public Shop_Order getById(int order_id);
public void update(Shop_Order shop_Order);
}
