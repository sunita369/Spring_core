package com.java.org;

public interface BankAccountService {
	
	
	public double withdraw(long accountID,double balance);
	public double deposit(long accountID,double balance);
	public double getBalance(long accountID);
	public boolean fundTransfer(long FromAccount,long toAccount,double amont);
	

}
