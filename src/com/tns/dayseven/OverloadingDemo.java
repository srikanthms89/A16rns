package com.tns.dayseven;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		System.out.println("..............costructor overloading....");
		PointConstructor p = new PointConstructor();
		System.out.println(p);
		
		PointConstructor p1 = new PointConstructor(10.0f);
		System.out.println(p1);
		
		PointConstructor p2 = new PointConstructor(10.0f,15.5f);
		System.out.println(p2);
		
		System.out.println("..............method overloading....");
		
		System.out.println("Addition of two integers:" +MethodOverloading.addition(10, 10));
		System.out.println("Addition of two floating:" +MethodOverloading.addition(10.0f, 10.0f));
		System.out.println("Addition of two floating:" +MethodOverloading.addition(10, 15.0f));
		System.out.println("Addition of two floating:" +MethodOverloading.addition(15.0f, 10));
		System.out.println("Addition of two Strings:" +MethodOverloading.addition("Hello", "TNSIF"));
	}

}
