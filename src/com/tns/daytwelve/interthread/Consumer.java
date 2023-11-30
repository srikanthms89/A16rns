package com.tns.daytwelve.interthread;

public class Consumer extends Thread {
	Q obj;

	public Consumer(Q obj) {


		this.obj = obj;
		start();
	}
	
	public void run()
	{
		while (true) {
			try {
				Thread.sleep(300);
			}catch(Exception e) {
				System.out.println(e);
			}
			obj.get();
		}
	}
	
	

}
