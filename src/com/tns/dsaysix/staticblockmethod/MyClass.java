package com.tns.dsaysix.staticblockmethod;

public class MyClass {
	
	private int section; //non static
	private static int srNo; //static
	
	
	//static block
	static {
		
		System.out.println("........within static block......");
		srNo = 1000;	
		
	}

	//default constructor
	MyClass()
	{
		System.out.println("......default constructor....");
		srNo++;
		section--;
	}

	@Override
	public String toString() {
		return "MyClass [Serial no"+srNo +",section=" + section + "]";
	}
	
	//static method
	static void display()
	{
		//System.out.println("Section :" +section);
		System.out.println("Serial No " +srNo);
	}
}
