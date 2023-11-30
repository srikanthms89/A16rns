//program to Demonstrate the Queue
package com.tns.daythirteen.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue <Integer> q = new LinkedList<>();
		
		//Add element (0,1,2,3,4}

		for(int i= 0;i<5; i++)
			q.add(i);
		
		//Dispaly contents of the Queue 
		System.out.println("Elements of Queue "+q);
		
		//To remove the head of queue 
		int removedele = q.remove();
		System.out.println("Removed element " +removedele);
		
		System.out.println("Elements of Queue "+q);
		
		
		//To view the head of Queue
		
		int head = q.peek();
		
		System.out.println("head of queue  "+head);
		
		
		
		
		
	



	}

}
