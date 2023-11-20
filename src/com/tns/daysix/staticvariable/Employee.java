package com.tns.daysix.staticvariable;

public class Employee {
	
	//Declaring the instance variables
	
	private String name;
	private int id;
	
	//Declaring static variable
	static String companyName = "TNSIF";
	
	Employee(String name,int id){
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	

}
