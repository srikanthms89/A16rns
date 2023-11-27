package com.tns.dayten.thread;

public class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException()
	{
		super("Insufficient balance in your ");
		
	}
	public InsufficientBalanceException(String message)
	{
		super(message);
	}

}
