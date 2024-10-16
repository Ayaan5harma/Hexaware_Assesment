package com.hexaware.bankingsystem.task8;

public class Account {
    
	protected int accountNumber;
    protected String accountType;
    protected double accountBalance;

    // Constructors
    public Account() {}

    public Account(int accountNumber, String accountType, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    // Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }
   
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // Deposit and Withdraw methods with different parameter types
    public void deposit(float amount) {
        accountBalance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + accountBalance);
    }

    public void deposit(int amount) {
        accountBalance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + accountBalance);
    }
    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + accountBalance);
    }

    public void withdraw(float amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + accountBalance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public void withdraw(int amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + accountBalance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

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
        System.out.println("This account type does not earn interest.");
    }

    // Print account information
    public void printAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }

}
