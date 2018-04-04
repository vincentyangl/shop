package com.bean;

public class Shop_Receive {
private int receive_id;//ID
private int member_id;//会员id
private String receive_name;//收货人
private String receive_phone;//收货人电话
private String receive_address;//详细地址
private int state;//是否为默认地址(默认为“1”)
public int getReceive_id() {
	return receive_id;
}
public void setReceive_id(int receive_id) {
	this.receive_id = receive_id;
}
public int getMember_id() {
	return member_id;
}
public void setMember_id(int member_id) {
	this.member_id = member_id;
}
public String getReceive_name() {
	return receive_name;
}
public void setReceive_name(String receive_name) {
	this.receive_name = receive_name;
}
public String getReceive_phone() {
	return receive_phone;
}
public void setReceive_phone(String receive_phone) {
	this.receive_phone = receive_phone;
}
public String getReceive_address() {
	return receive_address;
}
public void setReceive_address(String receive_address) {
	this.receive_address = receive_address;
}
public int getState() {
	return state;
}
public void setState(int state) {
	this.state = state;
}
@Override
public String toString() {
	return "Shop_Receive [receive_id=" + receive_id + ", member_id=" + member_id + ", receive_name=" + receive_name
			+ ", receive_phone=" + receive_phone + ", receive_address=" + receive_address + ", state=" + state + "]";
}

}
