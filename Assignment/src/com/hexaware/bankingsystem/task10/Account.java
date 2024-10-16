package com.hexaware.bankingsystem.task10;

public abstract class Account {
   
	 protected long accountNumber;
	    protected String accountType;
	    protected float accountBalance;
	    protected Customer customer;

	    // Default constructor
	    public Account() {}

	    // Parameterized constructor
	    public Account(long accountNumber, String accountType, float accountBalance, Customer customer) {
	        this.accountNumber = accountNumber;
	        this.accountType = accountType;
	        this.accountBalance = accountBalance;
	        this.customer = customer;
	    }

	    // Getters
	    public long getAccountNumber() {
	        return accountNumber;
	    }

	    public String getAccountType() {
	        return accountType;
	    }

	    public float getAccountBalance() {
	        return accountBalance;
	    }

	    public Customer getCustomer() {
	        return customer;
	    }

	    // Setters
	    public void setAccountNumber(long accountNumber) {
	        this.accountNumber = accountNumber;
	    }

	    public void setAccountType(String accountType) {
	        this.accountType = accountType;
	    }

	    public void setAccountBalance(float accountBalance) {
	        this.accountBalance = accountBalance;
	    }

	    public void setCustomer(Customer customer) {
	        this.customer = customer;
	    }
	    // Print account information
	    public void printAccountInfo() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Type: " + accountType);
	        System.out.println("Account Balance: " + accountBalance);
	        customer.printCustomerInfo();
	    }

}
