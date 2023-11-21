package com.tns.daynine.nestedinterfaces;

public class NestedInterface implements MyInterface.MyInnerInterface {
	
	@Override
	public void print()
	{
		System.out.println("print method of nested interface");
	}

}
