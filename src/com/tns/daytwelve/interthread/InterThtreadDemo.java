package com.tns.daytwelve.interthread;

public class InterThtreadDemo {

	public static void main(String[] args) {


		Q obj = new Q();
		
		Producer p1 = new Producer(obj);//producer thread
		
		Consumer c1 = new Consumer(obj); //consumer Thread
		
		try {
			p1.join();
			c1.join();
		}catch(InterruptedException e) {
			System.out.println(e);
		}

	}

}
