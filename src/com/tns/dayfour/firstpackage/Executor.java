package com.tns.dayfour.firstpackage;

public class Executor {

	public static void main(String[] args) {
		
		//accessing same package class
		Base b1 = new Base();
		
		b1.methodDefault();
		b1.methodPublic();
		b1.methodProtected();
		
		b1.varDefault = 11;
		b1.varPublic =21;
		b1.varProtected =41;
		
		b1.methodDefault();
		b1.methodPublic();
		b1.methodProtected();
		
		
		//instance of operator
		
		System.out.println(b1 instanceof Base);
		
		

	}

}
