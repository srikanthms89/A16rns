package com.tns.daysix.usingfinal;

final class FinalClass {
	void show()
	{
		System.out.println("Final class cannot be inherited");
	}
}

//class FinalClassChild extends FinalClass{
//	
//}

public class FinalClassDemo {

	public static void main(String[] args) {
     
		 //create the object of final class
		
		FinalClass f1 = new FinalClass();
		f1.show();
  

	}

}
