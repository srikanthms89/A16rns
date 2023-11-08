
package com.tns.daythree;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		//Scanner object to accept the user inputs
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.println("Enter the person name: ");
		name = sc.next();
		
		System.out.println("Enter the person income:");
		
		int income = sc.nextInt();
		
		System.out.println("Enter the person gender: ");
		
		String gender = sc.next();
		
		System.out.println("Enter the person age: ");
		
		int age = sc.nextInt();
		
		sc.close();
		
		//Person object and initialize the values
		Person obj = new Person();
		obj.setName(name);
		obj.setIncome(income);
		obj.setGender(gender);
		obj.setAge(age);
		
		//display the person details using toString() method
		System.out.println(obj);
		
		

	}

}
