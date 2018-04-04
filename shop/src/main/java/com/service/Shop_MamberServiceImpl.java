package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Shop_Member;
import com.mapper.Shop_MemberMapper;

@Service
public class Shop_MamberServiceImpl implements Shop_MemberService{
	@Autowired
	private Shop_MemberMapper smm;
	@Override
	public List<Shop_Member> listAll(Map map) {
		List<Shop_Member> list=smm.listAll(map);
		return list;
	}
	@Override
	public void delete(int member_id) {
		smm.delete(member_id);
		
	}
	@Override
	public void save(Shop_Member shop_Member) {
		smm.save(shop_Member);
		
	}
	@Override
	public void update(Shop_Member shop_Member) {
		smm.update(shop_Member);
		
	}
	@Override
	public Shop_Member getById(int member_id) {
		Shop_Member shop_Member=smm.getById(member_id);
		return shop_Member;
	}

}
