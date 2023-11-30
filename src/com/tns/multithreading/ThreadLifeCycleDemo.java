package com.tns.multithreading;

public class ThreadLifeCycleDemo extends Thread {
	
	public void run()
	{
		System.out.println("In side run() Thread is  alive or not?"+ this.isAlive());//false
		int num = 0;
		while (num < 4)
		{
			num++;
			System.out.println("num =" +num);
			try {
				sleep(500);
				System.out.println("In not runnable stage, Thread is Alive or not" +this.isAlive());//true
			}catch(InterruptedException ex ) {
				System.out.println("Thread interrupted...");
			}
		}
	}

	public static void main(String[] args) {
		
		
		Thread mythread = new ThreadLifeCycleDemo();
		System.out.println("Before Runnable stage ,Thread is alive or not" +mythread.isAlive());//false
		mythread.start();

		 try {
			 
			  Thread.sleep(4000);
		 }catch(InterruptedException ex)
		 {
			 System.out.println("Thread is interrupted" +ex.getMessage());
		 }
         
		 System.out.println("After complete execution of thread,it is alive or not" +mythread.isAlive());//false

	}

}
