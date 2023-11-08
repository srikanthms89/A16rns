package com.tns.dayfour.thirdpackage;

public class MyClassDemo {

	public static void main(String[] args) {


		MyClass m1 = new MyClass();
		
		m1.setId(100);
		
		System.out.println(m1);
		
		
		MyClass m2 = MyClass.getObj();
		
		System.out.println(m1);
		System.out.println(m2);
		
		
		MyClass m4 = new MyClass();
		m4.setId(200);
		System.out.println(m4);

	}

}
