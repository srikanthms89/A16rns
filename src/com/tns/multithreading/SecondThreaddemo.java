package com.tns.multithreading;

public class SecondThreaddemo {

	public static void main(String[] args) {

		SecondThread t1 = new SecondThread();
		Thread t = new Thread(t1);
		
		t.start();
	}

}
