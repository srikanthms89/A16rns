//Program to demonstrate Unchecked exception
package com.tns.dayten.exceptions;

public class UncheckedException {

	public static void main(String[] args) {
		
		int x[];
		try {
			
			x = new int [] {1, 2,3,4};
			System.out.println(x[3]); // out of bound
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("specified index does exist " +e.getMessage());
		}



	}

}
