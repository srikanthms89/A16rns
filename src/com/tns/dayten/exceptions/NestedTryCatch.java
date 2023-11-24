package com.tns.dayten.exceptions;

public class NestedTryCatch {
	
	public static void check()
	{
		String str = "TNSIFBangalore";
		int slength = str.length();
		System.out.println("String length :" +slength);
		String anotherString = null;
		
		int y=20;
		
		try {
			//Inner Try block
			try {
				System.out.println(str.charAt(y)); //Exception occured
			}catch(StringIndexOutOfBoundsException ex) {
				System.err.println("index is out of bounds " +ex.getMessage());
			}
			
			System.out.println("String length :" + anotherString.length());
			   
			
		}catch( NullPointerException npe)
		{
			System.err.println("exception is thrown " +npe.getMessage());
		}
	}

}
