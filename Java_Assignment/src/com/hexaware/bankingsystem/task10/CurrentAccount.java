package com.hexaware.bankingsystem.task10;

public class CurrentAccount extends Account{

	private float overdraftLimit;

	// Default constructor
	public CurrentAccount() {}

	// Parameterized constructor
	public CurrentAccount(long accountNumber, String accountType, float accountBalance, Customer customer, float overdraftLimit) {
	    super(accountNumber, accountType, accountBalance, customer);
	    this.overdraftLimit = overdraftLimit;
	}

	// Getters and Setters
	public float getOverdraftLimit() {
	    return overdraftLimit;
	}

	public void setOverdraftLimit(float overdraftLimit) {
	    this.overdraftLimit = overdraftLimit;
	}

	// Print account information
	@Override
	public void printAccountInfo() {
	    super.printAccountInfo();
	    System.out.println("Overdraft Limit: " + overdraftLimit);
	}


}
