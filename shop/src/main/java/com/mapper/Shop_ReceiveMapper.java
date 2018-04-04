package com.mapper;

import java.util.List;

import com.bean.Shop_Receive;

public interface Shop_ReceiveMapper {
public List<Shop_Receive> listAll();
public void delete(int receive_id);
public void save(Shop_Receive shop_Receive);
public void update(Shop_Receive shop_Receive);
public Shop_Receive getById(int receive_id);
}
