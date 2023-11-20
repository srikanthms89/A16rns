package com.tns.daysix.association;

public class HasDemo {

	public static void main(String[] args) {
	
		Address add = new Address("12 1st main","bangalore","karnataka","560024");
		
		Person p = new Person("punith",add);
		
		 p.display();

	}

}
