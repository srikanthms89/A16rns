package com.tns.dayeight.impinterfaces;

//Bank Interface
public interface Bank {
	
	double MIN_BALANCE = 1000;
	double DEPOSIT_LIMIT = 25000;
	double INT_RATE = 8.7;
	
	void deposit(Account account,double amount);
	void withdraw(Account account,double amount);
	
	

}
