//Program to demonstrate the Thread---extending Thread class
package com.tns.multithreading;

public class SingleThread  extends Thread{
	
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println(i);
		}
	}

}
