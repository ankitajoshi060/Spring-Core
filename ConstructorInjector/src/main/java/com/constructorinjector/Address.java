package com.constructorinjector;

public class Address {

	private int addressId;
	private String street;
	private String city;
	
	public Address(int addressId, String street, String city) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + "]";
	}
	
	
}
