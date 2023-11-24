package com.tns.dayten.exceptions;

public class Trycatch {
	
	static void perfromDivision(int x, int y) {
		int z;
		try {
			System.out.println("I am try block");
			z= x/y;
			System.out.println("Result of Z is :" +z);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Iam in catch block" +e.getMessage());
		}
		
	}



}
