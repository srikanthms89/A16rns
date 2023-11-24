package com.tns.dayeleven.multithrading;

public class RunnableDemo {

	public static void main(String[] args) {

		UsingRunnable ur = new UsingRunnable(10,20,"Hello");
		
		Runnable runnable = new Runnable () {
			@Override
			public void run() {
				
				System.out.println("Runnable with Anonymous class");
				
			}
		};
		
		Thread t1 = new Thread(runnable);
		t1.start();
		
		Thread t2 = new Thread(runnable);
		t2.start();
		
	}

}
