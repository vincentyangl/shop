package com.service;

import java.util.List;
import java.util.Map;

import com.bean.Shop_Member;

public interface Shop_MemberService {
	public List<Shop_Member> listAll(Map map);
	public void delete(int member_id);
	public void save(Shop_Member shop_Member);
	public void update(Shop_Member shop_Member);
	public Shop_Member getById(int member_id);
}
