//Nested Interface
package com.tns.daynine.nestedinterfaces;

public interface MyInterface {
	
	void calArea();
	interface MyInnerInterface{
		
		int id = 100;
		void print();
	}

}
