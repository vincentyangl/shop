package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Shop_Receive;
import com.mapper.Shop_ReceiveMapper;

@Service
public class Shop_ReceiveServiceImpl implements Shop_ReceiveService{
	@Autowired
	private Shop_ReceiveMapper shop_ReceiveMapper;
	@Override
	public List<Shop_Receive> listAll() {
		List<Shop_Receive> list=shop_ReceiveMapper.listAll();
		return list;
	}

	@Override
	public void delete(int receive_id) {
		shop_ReceiveMapper.delete(receive_id);
		
	}

	@Override
	public void save(Shop_Receive shop_Receive) {
		shop_ReceiveMapper.save(shop_Receive);
		
	}

	@Override
	public void update(Shop_Receive shop_Receive) {
		shop_ReceiveMapper.update(shop_Receive);
		
	}

	@Override
	public Shop_Receive getById(int receive_id) {
		Shop_Receive shop_Receive=shop_ReceiveMapper.getById(receive_id);
		return shop_Receive;
	}

}
