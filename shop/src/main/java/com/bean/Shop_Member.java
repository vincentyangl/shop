package com.bean;

public class Shop_Member {
private int member_id;//ID
private String member_username;//用户名
private String member_pwd;//密码
private String member_email;//电子邮箱
private String member_birth;//注册时间
private String member_phone;//电话号码
private String member_truename;//真实姓名
private String member_sex;//性别
private String member_image;//头像
private String member_birthday;//生日
public int getMember_id() {
	return member_id;
}
public void setMember_id(int member_id) {
	this.member_id = member_id;
}
public String getMember_username() {
	return member_username;
}
public void setMember_username(String member_username) {
	this.member_username = member_username;
}
public String getMember_pwd() {
	return member_pwd;
}
public void setMember_pwd(String member_pwd) {
	this.member_pwd = member_pwd;
}
public String getMember_email() {
	return member_email;
}
public void setMember_email(String member_email) {
	this.member_email = member_email;
}
public String getMember_birth() {
	return member_birth;
}
public void setMember_birth(String member_birth) {
	this.member_birth = member_birth;
}
public String getMember_phone() {
	return member_phone;
}
public void setMember_phone(String member_phone) {
	this.member_phone = member_phone;
}
public String getMember_truename() {
	return member_truename;
}
public void setMember_truename(String member_truename) {
	this.member_truename = member_truename;
}
public String getMember_sex() {
	return member_sex;
}
public void setMember_sex(String member_sex) {
	this.member_sex = member_sex;
}
public String getMember_image() {
	return member_image;
}
public void setMember_image(String member_image) {
	this.member_image = member_image;
}
public String getMember_birthday() {
	return member_birthday;
}
public void setMember_birthday(String member_birthday) {
	this.member_birthday = member_birthday;
}
@Override
public String toString() {
	return "shop_mamber [member_id=" + member_id + ", member_username=" + member_username + ", member_pwd=" + member_pwd
			+ ", member_email=" + member_email + ", member_birth=" + member_birth + ", member_phone=" + member_phone
			+ ", member_truename=" + member_truename + ", member_sex=" + member_sex + ", member_image=" + member_image
			+ ", member_birthday=" + member_birthday + "]";
}

}
