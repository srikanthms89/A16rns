package com.tns.dsaysix.staticblockmethod;

public class MyClassDemo {

	public static void main(String[] args) {


		MyClass m = new MyClass();
		System.out.println(m);
		
		//static method with class name
		
		MyClass.display();
		
		MyClass m2 = new MyClass();
		System.out.println(m2);
		
		MyClass.display();
		
		MyClass m3 = new MyClass();
		System.out.println(m3);
		MyClass.display(); /// sr 1003 sec 3

	}

}
