package com.sunita;

public class Address {
	private String street;
	public String getState(){
		return state;
	}

	public void setState(String state){
		this.state = state;
	}
	private String city;
	private String state;
	private int zip;

	private String country;
	public String getStreet(){
		return street;
		}
	public void setStreet(String street){
		this.street = street;
	}
	public String getCity(){
		return city ;
	}
	public void setCity(String city){
		this.city  = city ;
	}
	public int getZip(){
		return zip;
	}
	public void setZip(int zip){
		this.zip= zip;
	}
	public String getCountry(){
		return country;
	}
	public void setCountry(String country){
	this.country = country;
	}
	public String toString(){
	return street+" "+city+" "+state+" "+zip+" "+country;
	}

}
