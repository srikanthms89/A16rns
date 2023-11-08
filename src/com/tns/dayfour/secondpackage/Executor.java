//Program to demonstrate accessing classes and methods of different package
package com.tns.dayfour.secondpackage;

import com.tns.dayfour.firstpackage.Base;

public class Executor {

	public static void main(String[] args) {
		
		Base b1 = new Base ();
		
		b1.methodPublic();
		b1.varPublic = 100;
		b1.methodPublic();
	}

}
