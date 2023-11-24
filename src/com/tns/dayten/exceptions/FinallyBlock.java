//Program to demonstrate finally block
package com.tns.dayten.exceptions;

public class FinallyBlock {
	
	public static void divide(int a, int b)
	{
		try {
			System.out.println(".....within try block.....");
			int result = a / b;
			System.out.println("Result :" +result);
		}catch (ArithmeticException ae) {
			System.out.println("ArithmeticException caught" +ae.getMessage());
		}finally {
			System.out.println("Finally Block...");
			
			
		}
		System.out.println("Statement after finally block");
	}

}
