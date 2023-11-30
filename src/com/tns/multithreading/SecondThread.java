//Program to demonstrate the Thread---Implementing Runnable
package com.tns.multithreading;

public class SecondThread implements Runnable {
	
	
	public void run() {
		for (int i=0; i<4; i++)
		{
			System.out.println(i);
		}
	}

}
