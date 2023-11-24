//program to demonstrate implementable class of Runnable interfaces
package com.tns.dayeleven.multithrading;

public class UsingRunnable implements Runnable {
	
	Thread t ;
	int h, l;
	String msg;
	
	public UsingRunnable( int h, int l, String msg) {

		this.h = h;
		this.l = l;
		this.msg = msg;
		t = new Thread (this,"Child Thread");
		t.start();
	}
	
	@Override
	public void run()
	{
		
		for( int i= 1; i<=h; i++)
		{
			try {
				 Thread.sleep(500);
				 
			}catch(InterruptedException e) {
				System.out.println("Error" +e.getMessage());
			}
			System.out.println(msg + i);
		}
	}
	

	
	

}
