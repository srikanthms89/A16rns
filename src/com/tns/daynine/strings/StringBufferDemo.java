package com.tns.daynine.strings;

public class StringBufferDemo {

	public static void main(String[] args) {

     //StringBuffer length vs capacity 
		
		StringBuffer buffer = new StringBuffer ("Hello");
		System.out.println("buffer = " + buffer);
		System.out.println("length =" +buffer.length());
		System.out.println("capacity =" +buffer.capacity());
		
		//appending and inserting into string buffer
		
		String s;
		int a = 500;
		
		buffer = new StringBuffer(40);
		s= buffer.append("a= ").append(a).append("!").toString();
		
		System.out.println(s);
		System.out.println(buffer);
		
		buffer = new StringBuffer ("abcdefghi");
		buffer.append("klmn");
		
		System.out.println(buffer);
		
		buffer.delete(7,10);
		System.out.println(buffer);
		
		
		System.out.println(buffer.reverse());
		
		

	}

}
