package com.sunita;

public class Customer {
	private int customerId;
	private String customerName;
	private long customerContact;
	private Address customerAddress;
	private String city;
	private String state;
	private String street;
	private String country;
	private int zip;
	
	
	
	public Customer(String street, String city, String state, int zip, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	public Customer(int i, String string, int j, Address address) {
		// TODO Auto-generated constructor stub
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName =customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress =customerAddress;
	}
	
	public void displayInfo() {
		System.out.println("Customer Id: "+customerId+" Customer Name: "+customerName);
		System.out.println("Address :"+customerAddress);
		System.out.println("Contact: "+customerContact);
	}
}
