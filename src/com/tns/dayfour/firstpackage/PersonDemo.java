package com.tns.dayfour.firstpackage;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person  p1 = new Person();
		
		Scanner sc = new Scanner(System.in);
		String name,city;
		int age;
		
		System.out.println("Enter person details");
		name = sc.nextLine();
		city = sc.nextLine();
		age = sc.nextInt();
		
		p1.setPersonName(name);
		p1.setPersonAge(age);
		p1.setPersonCity(city);
		 System.out.println("Person details  Name:" + p1.getPersonName() + "\tAge" +p1.getPersonAge() +"\tCity" +p1.getPersonCity());
		 
		
		 System.out.println("Enter the person details:Name ,city,age");
		 sc.nextLine();
		 name = sc.nextLine();
		 age = sc.nextInt();
		 sc.nextLine();
		 city= sc.nextLine();
		
		 
		 p1=new Person(name,age,city);
		 System.out.println("Person details  Name:" + p1.getPersonName() + "\tAge" +p1.getPersonAge() +"\tCity" +p1.getPersonCity());
		 sc.close();
		 

	}

}
