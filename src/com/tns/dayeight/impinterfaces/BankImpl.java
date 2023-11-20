package com.tns.dayeight.impinterfaces;

public class BankImpl implements Bank {
	
	@Override
	public void deposit (Account account,double amount) {
		
		if(amount > DEPOSIT_LIMIT) 
			System.err.println("Deposit not possible..exceeds Deposit limits");
		else
			account.setBalance(account.getBalance()+amount);
		System.out.println("Deposited" + amount + "into Account" +account.getAccNo());
			
			
		
	}
	@Override
	public void withdraw(Account account,double amount) {
		
		if(account.getBalance() - amount  >= MIN_BAL)
		{
			account.setBalance(account.getBalance());
			System.out.println("Withdrawn " +amount + "from account"+ account.getAccNo());
		}
		else
			System.out.println("Insufficient balance in account");
		
	}
	
	

}
