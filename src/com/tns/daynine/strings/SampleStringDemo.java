package com.tns.daynine.strings;

public class SampleStringDemo {

	public static void main(String[] args) {

		
		//Simple String operation
    char c[] = {'I', 'n','d','i','a'};
    
    String s1 = new String (c);
    
    String s2 = new String (s1);
    
    System.out.println(s1);
    System.out.println(s2);
    
    //using concatination
    
    String longstr = "This is to show " + " how string concatination" +"can happen"+"operator ";
    System.out.println(longstr);
    
		 

	}

}
