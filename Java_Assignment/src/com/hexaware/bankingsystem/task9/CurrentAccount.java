package com.hexaware.bankingsystem.task9;

public class CurrentAccount extends BankAccount {

	 private static final double OVERDRAFT_LIMIT = 1000.0;

	    // Default constructor
	    public CurrentAccount() {}

	    // Parameterized constructor
	    public CurrentAccount(int accountNumber, String customerName, double balance) {
	        super(accountNumber, customerName, balance);
	    }

	    // Implement deposit method
	    @Override
	    public void deposit(float amount) {
	        balance += amount;
	        System.out.println("Deposited: " + amount);
	        System.out.println("New Balance: " + balance);
	    }
	    
	    // Implement withdraw method
	    @Override
	    public void withdraw(float amount) {
	        if (balance + OVERDRAFT_LIMIT >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	            System.out.println("New Balance: " + balance);
	        } else {
	            System.out.println("Withdrawal exceeds overdraft limit");
	        }
	    }

	    // Implement calculateInterest method
	    @Override
	    public void calculateInterest() {
	        System.out.println("No interest for Current Account");
	    }

	    // Print account information
	    @Override
	    public void printAccountInfo() {
	        super.printAccountInfo();
	        System.out.println("Overdraft Limit: " + OVERDRAFT_LIMIT);
	    }



}
