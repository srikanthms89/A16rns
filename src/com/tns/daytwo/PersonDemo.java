package com.tns.daytwo;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the person details");
		int age ,income;
		String name,gender;
	
		age = sc.nextInt();
		income = sc.nextInt();
		
		name = sc.next();
	    sc.nextLine();
		gender = sc.nextLine();
		
		Person p = new Person();
	
		p.setAge(age);
		p.setName(name);
		p.setIncome(income);
		p.setGender(gender);
		
		System.out.println(p);
		
		sc.close();
		
		

	}

}
