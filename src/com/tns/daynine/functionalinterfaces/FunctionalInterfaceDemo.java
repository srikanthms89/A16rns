package com.tns.daynine.functionalinterfaces;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {


		GreetClass g = new GreetClass();
		System.out.println(g.greet());
		
		//using lamba expressions
		GreetInterface g1 = () ->{
			 return "Good evening";
			 
		};
		
		System.out.println(g1.greet());

	}

}
