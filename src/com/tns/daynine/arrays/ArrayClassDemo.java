package com.tns.daynine.arrays;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {

     //array
		
		int intArr[] = {100,20,30,40,50};
		
		//to print the elements in one line
		System.out.println("Array is :" +Arrays.toString(intArr));
		
		Arrays.sort(intArr);
		
		System.out.println("............................");
		System.out.println("Array is :" +Arrays.toString(intArr));
		
		
		int intkey = 100;
		
		System.out.println(intkey + "found at index= " +Arrays.binarySearch(intArr, intkey));

	}

}
