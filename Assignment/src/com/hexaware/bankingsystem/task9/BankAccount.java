package com.hexaware.bankingsystem.task9;

public abstract class BankAccount {
   
	 protected int accountNumber;
	    protected String customerName;
	    protected double balance;

	    // Default constructor
	    public BankAccount() {}

	    // Parameterized constructor
	    public BankAccount(int accountNumber, String customerName, double balance) {
	        this.accountNumber = accountNumber;
	        this.customerName = customerName;
	        this.balance = balance;
	    }

	    // Getters
	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    // Setters
	    public void setAccountNumber(int accountNumber) {
	        this.accountNumber = accountNumber;
	    }

	    public void setCustomerName(String customerName) {
	        this.customerName = customerName;
	    }
	    
	    // Print account information
	    public void printAccountInfo() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Balance: " + balance);
	    }

	    // Abstract methods
	    public abstract void deposit(float amount);

	    public abstract void withdraw(float amount);

	    public abstract void calculateInterest();


}
