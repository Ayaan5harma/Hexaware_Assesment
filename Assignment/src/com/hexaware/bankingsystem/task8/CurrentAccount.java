package com.hexaware.bankingsystem.task8;

public class CurrentAccount extends Account {
  
	private static final double OVERDRAFT_LIMIT = 1000.0;
    private double overdraftLimit;

    // Constructors
    public CurrentAccount() {}

    public CurrentAccount(int accountNumber, String accountType, double accountBalance) {
        super(accountNumber, accountType, accountBalance);
        this.overdraftLimit = OVERDRAFT_LIMIT;
    }

    // Getters and Setters
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
 // Override withdraw method
    @Override
    public void withdraw(double amount) {
        if (getAccountBalance() + overdraftLimit >= amount) {
            setAccountBalance(getAccountBalance() - amount);
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + getAccountBalance());
        } else {
            System.out.println("Withdrawal exceeds overdraft limit");
        }
    }

    @Override
    public void withdraw(float amount) {
        if (getAccountBalance() + overdraftLimit >= amount) {
            setAccountBalance(getAccountBalance() - amount);
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + getAccountBalance());
        } else {
            System.out.println("Withdrawal exceeds overdraft limit");
        }
    }
    @Override
    public void withdraw(int amount) {
        if (getAccountBalance() + overdraftLimit >= amount) {
            setAccountBalance(getAccountBalance() - amount);
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + getAccountBalance());
        } else {
            System.out.println("Withdrawal exceeds overdraft limit");
        }
    }

    // Print account information
    @Override
    public void printAccountInfo() {
        super.printAccountInfo();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }




}
