package com.tns.dayeight.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Square sq = new Square();
		Rectangle r1 = new Rectangle ();
		
		sq.calArea();
		sq.show();
		
		r1.calArea();
		r1.show();
		
		System.out.println("..........................");
		// Runtime polymorphism / Dynamic binding / late binding
		//Ex:method overriding
		
		Shape sh;
		sh = new Square(12.6f);
		
		sh.calArea();
		sh.show();
		
		sh = new Rectangle(10,20);
		sh.calArea();
		sh.show();
		
		
		

	}

}
