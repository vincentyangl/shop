package com.bean;

public class ReturnOrder {

	private int retId;//�˿�ID
	private String retSerialNum;//�˿���ˮ��
	private String retType;//�˿�����
	private String retTime;//�˿���������
	private String retState;//�˿�״̬
	private Shop_Order shop_Order;//����ID
	private String retPayType;//�˿�֧������
	private ReturnCause return_cause;//�˿�ԭ��
	private String retExplain;//�˿�˵��
	private ShipInformation shipInformation;//��������Ϣ
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
