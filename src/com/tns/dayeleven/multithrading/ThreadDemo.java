package com.tns.dayeleven.multithrading;

public class ThreadDemo {

	public static void main(String[] args) {

		ChildThread  t1 = new ChildThread(5,"First");
		ChildThread t2 = new ChildThread(10,"Second");
		
		ChildThread t3 = new ChildThread(5,"Third");
		
		
		t1.start();
		//t1.run();
		t2.start();
		
		t3.start();
 
	}

}
