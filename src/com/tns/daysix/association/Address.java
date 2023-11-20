//contained class
package com.tns.daysix.association;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private String postalcode;
	public Address() {
		super();
	}
	public Address(String street, String city, String state, String postalcode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalcode = postalcode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", postalcode=" + postalcode + "]";
	}
	
	
	
	
	

}
