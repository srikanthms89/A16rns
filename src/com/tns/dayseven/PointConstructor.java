////Program to demonstrate the constructor Overloading
package com.tns.dayseven;

public class PointConstructor {
	
	private float x;
	private float y;
	
	public PointConstructor()
	{
		x= 0.0f;
		y= 0.01f;
	}

	public PointConstructor(float x)
	{
		this.x= x;
		this.y = y;
		
	}
	public PointConstructor(float x,float y)
	{
		this.x= x;
		this.y = y;
		
	}

	@Override
	public String toString() {
		return "PointConstructor [x=" + x + ", y=" + y + "]";
	}
	

}
