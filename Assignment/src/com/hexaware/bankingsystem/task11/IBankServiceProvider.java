package com.hexaware.bankingsystem.task11;

public interface IBankServiceProvider {

	 void create_account(Customer customer, long accNo, String accType, float balance);
	    Account[] listAccounts();
	    void calculateInterest();

}
