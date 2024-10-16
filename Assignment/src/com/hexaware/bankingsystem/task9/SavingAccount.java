package com.hexaware.bankingsystem.task9;

public class SavingAccount extends BankAccount {

	 private double interestRate;

	    // Default constructor
	    public SavingAccount() {}

	    // Parameterized constructor
	    public SavingAccount(int accountNumber, String customerName, double balance, double interestRate) {
	        super(accountNumber, customerName, balance);
	        this.interestRate = interestRate;
	    }

	    // Getters and Setters
	    public double getInterestRate() {
	        return interestRate;
	    }

	    public void setInterestRate(double interestRate) {
	        this.interestRate = interestRate;
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
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	            System.out.println("New Balance: " + balance);
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }
	    // Implement calculateInterest method
	    @Override
	    public void calculateInterest() {
	        double interest = balance * interestRate / 100;
	        balance += interest;
	        System.out.println("Interest added: " + interest);
	        System.out.println("New Balance: " + balance);
	    }

	    // Print account information
	    @Override
	    public void printAccountInfo() {
	        super.printAccountInfo();
	        System.out.println("Interest Rate: " + interestRate);
	    }
	    
	    
}


