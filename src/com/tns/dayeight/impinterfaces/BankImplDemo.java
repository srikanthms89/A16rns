package com.tns.dayeight.impinterfaces;

public class BankImplDemo {

	public static void main(String[] args) {

           // create a bank instance
		Bank bank = new BankImpl();
		
		//crate an account
		
		Account account = new Account(12345,"punith",18000,bank);
		
		//Deposit money
		//account.deposit(2000);
	 System.out.println(account);
	 
	 //withdraw money
	 //account.withdraw(1000);
	 System.out.println(account);
	 
	 
	      

	}

}
