//Program to demonstrate method Overriding
package com.tns.dayseven.overriding;
//sub class
public class SBI extends RBI {
	@Override
	public float getRateOfInterest() {
		return 7.0f;
	}
	public SBI getObject()
	{
		return this;
	}

}
