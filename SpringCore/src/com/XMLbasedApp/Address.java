package com.XMLbasedApp;

public class Address {
	private int doorNo;
	private String city;
	private CoOrdinates coOrdinates;
	
	public CoOrdinates getCoOrdinates() {
		return coOrdinates;
	}
	public void setCoOrdinates(CoOrdinates coOrdinates) {
		this.coOrdinates = coOrdinates;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int doorNo, String city) {
		this.doorNo = doorNo;
		this.city = city;
	}
	

}
