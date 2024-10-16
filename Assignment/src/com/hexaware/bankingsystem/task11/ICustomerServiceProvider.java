package com.hexaware.bankingsystem.task11;

public interface ICustomerServiceProvider {
   
	 float get_account_balance(long accountNumber);
	    float deposit(long accountNumber, float amount);
	    float withdraw(long accountNumber, float amount);
	    float transfer(long fromAccountNumber, long toAccountNumber, float amount);
	    void getAccountDetails(long accountNumber);

}
