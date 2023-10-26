package com.tnsif.dayone;

public class TypeCastingDemo {

	public static void main(String[] args) {
	
		 //widening / Implicit
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		float f = 32.767f;
		double d = f;
		System.out.println(d);
		
		char ch = 'A';
		int i2 = ch;
		System.out.println(i2);
		
		
		//Explicit / narrowing 
		
		double f1 = 10.567f;
		long l = (long) f1;
		System.out.println(l);
		
		long l1 = 900840113;
		int i3 = (int)l1;
		System.out.println(i3);
		

	}

}
