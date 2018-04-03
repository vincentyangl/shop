package com.bean;

public class ShipInformation {
	
	private int shipId;
	private String shipName;
	private int shipPhoneNum;
	private String shipSite;
	private int defaults;
	public int getShipId() {
		return shipId;
	}
	public void setShipId(int shipId) {
		this.shipId = shipId;
	}
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public int getShipPhoneNum() {
		return shipPhoneNum;
	}
	public void setShipPhoneNum(int shipPhoneNum) {
		this.shipPhoneNum = shipPhoneNum;
	}
	public String getShipSite() {
		return shipSite;
	}
	public void setShipSite(String shipSite) {
		this.shipSite = shipSite;
	}
	public int getDefaults() {
		return defaults;
	}
	public void setDefaults(int defaults) {
		this.defaults = defaults;
	}
	@Override
	public String toString() {
		return "ShipInformation [shipId=" + shipId + ", shipName=" + shipName + ", shipPhoneNum=" + shipPhoneNum
				+ ", shipSite=" + shipSite + ", defaults=" + defaults + "]";
	}
	
	
}
