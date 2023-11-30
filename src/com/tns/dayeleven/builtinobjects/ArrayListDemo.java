//Program to demonstrate ArrayList
package com.tns.dayeleven.builtinobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {


		List list1 = new ArrayList (); // create empty raw Array list
		System.out.println("Size: " +list1.size());
		
		System.out.println("Is list Empty?" +list1.isEmpty());
		
		list1.add(10);
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add(20);
		list1.add("Hello");
		list1.add(56.89);
		list1.add(20);
		list1.add('M');
		list1.add(5,"Hi");
		list1.add(20);
		
		System.out.println("List is " +list1);
		
		System.out.println("Is list contains 15?"+list1.contains(20));
		
		list1.remove(false);
		
		System.out.println("List is " +list1);
		
	 //System.out.println(list1.remove(9));
	 
	 System.out.println("List is " +list1);
	 
	 
	 System.out.println("Element removed : " +list1.remove(list1.lastIndexOf(20)));
	 
	 
//	 Collections.sort(list1);
//	 System.out.println("List is " +list1);
	 
	 
	  list1.clear();
	  System.out.println("List is " +list1);
	  
	  
		
		
		
		
		
		
	}

}
