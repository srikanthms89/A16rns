package com.tns.dayten.thread;

public class SynchronizedDemo {

	public static void main(String[] args) {


		  Account a1 = new Account (101,"kumar",60000);
		  
		  System.out.println(a1);
		  
		  
		  //Five accounts Threads running parallel and sharing same resources
		  
		  AccountThread  t[] = new   AccountThread [5];
		  
		  for (int i= 0; i< 5 ; i++) {
			  t[i] = new AccountThread(a1,1000 *(i+1));
			  
			  try {
				  
				  t[i].join(); //waits main thread till execution 
				  
			  }catch(InterruptedException e)
			  {
				  System.out.println(e.getMessage());
			  }
		  }
		  
		  System.out.println("............................");
		  System.out.println(a1);
		  
		  
		  

	}

}
