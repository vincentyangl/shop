package com.bean;

import java.util.List;

public class Permissions {
	
	//权限编号
	private int per_id;
	//权限名称
	private String per_name;
	//权限别名
	private String per_newName;
	//跳转路径
	private String per_url;
	//是否为菜单
	private int per_menu;
	//父元素Id
	private int per_parentId;
	//子元素集合
	private List<Permissions> pers;
	public int getPer_id() {
		return per_id;
	}
	public void setPer_id(int per_id) {
		this.per_id = per_id;
	}
	public String getPer_name() {
		return per_name;
	}
	public void setPer_name(String per_name) {
		this.per_name = per_name;
	}
	public String getPer_newName() {
		return per_newName;
	}
	public void setPer_newName(String per_newName) {
		this.per_newName = per_newName;
	}
	public String getPer_url() {
		return per_url;
	}
	public void setPer_url(String per_url) {
		this.per_url = per_url;
	}
	public int getPer_menu() {
		return per_menu;
	}
	public void setPer_menu(int per_menu) {
		this.per_menu = per_menu;
	}
	public int getPer_parentId() {
		return per_parentId;
	}
	public void setPer_parentId(int per_parentId) {
		this.per_parentId = per_parentId;
	}
	public List<Permissions> getPers() {
		return pers;
	}
	public void setPers(List<Permissions> pers) {
		this.pers = pers;
	}
	
}
