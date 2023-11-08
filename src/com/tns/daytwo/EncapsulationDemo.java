//Program to demonstrate class and object
package com.tns.daytwo;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		//Object creation
		
		OopsConceptDemo obj = new OopsConceptDemo();
		
		obj.setSerialNum(1001);
		obj.setName("kumar");
		obj.setAge(25);
		
		System.out.println(obj);
		OopsConceptDemo  obj2 = new OopsConceptDemo();
		obj2.setSerialNum(1002);
		obj2.setName("akshay");
		obj2.setAge(23);
		
		System.out.println(obj2);
		
		
		

	}

}
