package com.hexaware.bankingsystem.task7;

public class Account {
	 
	private int accountNumber;
    private String accountType;
    private double accountBalance;

    // Default constructor
    public Account() {}

    // Overloaded constructor
    public Account(int accountNumber, String accountType, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }
    public double getAccountBalance() {
        return accountBalance;
    }

    // Setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // Deposit amount
    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + accountBalance);
    }

    // Withdraw amount
    public void withdraw(double amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + accountBalance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Calculate interest
    public void calculateInterest() {
        if (accountType.equals("Savings")) {
            double interest = accountBalance * 0.045;
            accountBalance += interest;
            System.out.println("Interest added: " + interest);
            System.out.println("New Balance: " + accountBalance);
        } else {
            System.out.println("Interest calculation only applicable for Savings accounts");
        }
    }
 // Print account information
    public void printAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }

		 

}
