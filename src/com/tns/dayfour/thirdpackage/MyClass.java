//Program to demonstrate singleton class
package com.tns.dayfour.thirdpackage;

public class MyClass {
	
	private static MyClass obj =new MyClass();
	
	private int id;

	public static MyClass getObj() {
		return obj;
	}

	public static void setObj(MyClass obj) {
		MyClass.obj = obj;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	
	
	
	
	

}
