package com.tns.dayten.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplecatchBlock {
	
	public static void divide()
	{
		
		int a,b,c;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two numbers");
		
		try {
			
			a= sc.nextInt();
			b= sc.nextInt();
			
			c = a/ b;
			System.out.println("division is : " +c);
			
			
		}catch(InputMismatchException e ) {
			System.out.println("Invalid input please enter integers" );
		}catch(ArithmeticException  | ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Exception caught:" +e.getMessage());
		}catch(Exception e)
		{
			System.out.println("Exception caught:" +e.getMessage());
		}
				
		
	}

}
