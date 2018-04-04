package com.bean;

public class Shop_Order {
private int order_id;//ID
private String order_code;//订单编号
private Double order_price;//订单总金额
private String create_time;//下单日期
private String finished_time;//结单日期
private Shop_Member member_ids;//会员ID
private int order_status;//订单状态
private int payment_status;//支付状态
private int shipping_status;//配送状态
private String payment_way;//支付方式(支付宝)
private Shop_Receive receive_ids;//收货人ID
public int getOrder_id() {
	return order_id;
}
public void setOrder_id(int order_id) {
	this.order_id = order_id;
}
public String getOrder_code() {
	return order_code;
}
public void setOrder_code(String order_code) {
	this.order_code = order_code;
}
public Double getOrder_price() {
	return order_price;
}
public void setOrder_price(Double order_price) {
	this.order_price = order_price;
}
public String getCreate_time() {
	return create_time;
}
public void setCreate_time(String create_time) {
	this.create_time = create_time;
}
public String getFinished_time() {
	return finished_time;
}
public void setFinished_time(String finished_time) {
	this.finished_time = finished_time;
}
public int getOrder_status() {
	return order_status;
}
public Shop_Member getMember_ids() {
	return member_ids;
}
public void setMember_ids(Shop_Member member_ids) {
	this.member_ids = member_ids;
}
public void setOrder_status(int order_status) {
	this.order_status = order_status;
}
public int getPayment_status() {
	return payment_status;
}
public void setPayment_status(int payment_status) {
	this.payment_status = payment_status;
}
public int getShipping_status() {
	return shipping_status;
}
public void setShipping_status(int shipping_status) {
	this.shipping_status = shipping_status;
}
public String getPayment_way() {
	return payment_way;
}
public void setPayment_way(String payment_way) {
	this.payment_way = payment_way;
}
public Shop_Receive getReceive_ids() {
	return receive_ids;
}
public void setReceive_ids(Shop_Receive receive_ids) {
	this.receive_ids = receive_ids;
}
@Override
public String toString() {
	return "Shop_Order [order_id=" + order_id + ", order_code=" + order_code + ", order_price=" + order_price
			+ ", create_time=" + create_time + ", finished_time=" + finished_time + ", member_ids=" + member_ids
			+ ", order_status=" + order_status + ", payment_status=" + payment_status + ", shipping_status="
			+ shipping_status + ", payment_way=" + payment_way + ", receive_ids=" + receive_ids + "]";
}

}
