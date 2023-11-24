package com.tns.daynine.strings;

public class StringComparion {

	public static void main(String[] args) {
        
		//creating strings using literals
		
		String s1 ="TNSIF";
		String s2 ="TNSIF";
		
		//creating strings using new operator
		
		String s3 = new String("tns");
		String s4 = new String("tns");
		
		// == equals
		System.out.println("s1 == s2 :" +(s1 == s2));
		System.out.println(" s1 == s3 : " + (s1 == s3));
		System.out.println("s4 == s3 :" + (s4 == s3));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//compareTo
		
		System.out.println(s1.compareTo("TNSIF"));
		System.out.println(s1.compareToIgnoreCase("tnsif"));
		System.out.println(s1.compareTo(s2));
		System.out.println(s3.compareTo(s4));
		
		
		

	}

}
