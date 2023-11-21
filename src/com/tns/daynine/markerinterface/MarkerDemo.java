package com.tns.daynine.markerinterface;

public class MarkerDemo {

	public static void main(String[] args) {
		
		Student s = new Student (101,"punith",50000,"Java");
		
		if(s instanceof Student)
		{
			System.out.println("student is registered for the course");
			System.out.println(s);
		}
		   
		else
			System.out.println("student is not registered for the course");
		
		
		
	}

}
