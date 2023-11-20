//program to define Container class
package com.tns.daysix.association;

public class Person {
	
	private String name;
	
	private Address address;

	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		
		System.out.println("name: " +name);
		System.out.println("Address:" +address.getStreet() +"," +address.getCity()+"," +address.getState()+"," +address.getPostalcode());
	}
	
	

}
