package com.bean;

public class ReturnOrder {

	private int retId;//退款ID
	private String retSerialNum;//退款流水号
	private String retType;//退款类型
	private String retTime;//退款申请日期
	private String retState;//退款状态
	private Shop_Order shop_Order;//订单ID
	private String retPayType;//退款支付类型
	private ReturnCause return_cause;//退款原因
	private String retExplain;//退款说明
	private ShipInformation shipInformation;//发货人信息
	public int getRetId() {
		return retId;
	}
	public void setRetId(int retId) {
		this.retId = retId;
	}
	public String getRetSerialNum() {
		return retSerialNum;
	}
	public void setRetSerialNum(String retSerialNum) {
		this.retSerialNum = retSerialNum;
	}
	public String getRetType() {
		return retType;
	}
	public void setRetType(String retType) {
		this.retType = retType;
	}
	public String getRetTime() {
		return retTime;
	}
	public void setRetTime(String retTime) {
		this.retTime = retTime;
	}
	public String getRetState() {
		return retState;
	}
	public void setRetState(String retState) {
		this.retState = retState;
	}
	public Shop_Order getShop_Order() {
		return shop_Order;
	}
	public void setShop_Order(Shop_Order shop_Order) {
		this.shop_Order = shop_Order;
	}
	public String getRetPayType() {
		return retPayType;
	}
	public void setRetPayType(String retPayType) {
		this.retPayType = retPayType;
	}
	public ReturnCause getReturn_cause() {
		return return_cause;
	}
	public void setReturn_cause(ReturnCause return_cause) {
		this.return_cause = return_cause;
	}
	public String getRetExplain() {
		return retExplain;
	}
	public void setRetExplain(String retExplain) {
		this.retExplain = retExplain;
	}
	public ShipInformation getShipInformation() {
		return shipInformation;
	}
	public void setShipInformation(ShipInformation shipInformation) {
		this.shipInformation = shipInformation;
	}
}
