package com.hexaware.bankingsystem.task10;

public class SavingAccount extends Account {
   
	private float interestRate;

	public SavingAccount(long accountNumberCounter, String accountType, float balance, Customer customer, float f) {
		 super(accountNumberCounter, accountType, balance, customer);
		    this.interestRate = f;
	}

	// Default constructor
	public void SavingsAccount() {}

	

	// Getters and Setters
	public float getInterestRate() {
	    return interestRate;
	}

	public void setInterestRate(float interestRate) {
	    this.interestRate = interestRate;
	}
	// Print account information
	@Override
	public void printAccountInfo() {
	    super.printAccountInfo();
	    System.out.println("Interest Rate: " + interestRate);
	}



}
