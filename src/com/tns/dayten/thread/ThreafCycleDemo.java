package com.tns.dayten.thread;

public class ThreafCycleDemo  extends Thread{

	public void run()
	{
		System.out.println("Inside run method thread is alive or not" +this.isAlive());
		int num= 0;
		while (num<4) {
			num++;
			System.out.println("num = " +num);
		try {
			
			sleep(500);
			System.out.println("In not ruunable stage ,Thread is alive or not");
		}catch(InterruptedException exp) {
			System.out.println("Thread Interrupted...");
		}
			
		}
			
	}
	
	public static void main(String[] args) {
		
		
		Thread myThread = new ThreafCycleDemo ();
		
		System.out.println("Before Runnable stage Thread is alive or not"  +myThread.isAlive());
		
		myThread.start();
		
		try {
			
			Thread.sleep(40000);
			
		}catch(InterruptedException exp) {
			System.out.println("Thread is interrupted!");
		}

		  System.out.println("After complete exceution of thread, it is alive or " +myThread.isAlive()) ;
    

	}

}
