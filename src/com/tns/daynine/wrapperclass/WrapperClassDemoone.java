//Program to demonstrate command line arguments 
package com.tns.daynine.wrapperclass;

public class WrapperClassDemoone {

	public static void main(String[] args) {


		System.out.println("hello world");
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int c  = a + b ;
		
		System.out.println(c);
		
		

	}

}
