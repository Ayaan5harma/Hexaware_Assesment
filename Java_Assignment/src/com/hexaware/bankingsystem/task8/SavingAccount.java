package com.hexaware.bankingsystem.task8;

public class SavingAccount  extends Account {
   
    private double interestRate;

    // Constructors
 
   


	public void SavingsAccount() {}

	 public SavingAccount(int accountNumber, String accountType, double initialBalance, double interestRate2) {
		 super(accountNumber, accountType, initialBalance);
	        this.interestRate = interestRate2;
		}
   

    // Getters and Setters
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
  
    // Override calculateInterest method
    @Override
    public void calculateInterest() {
        double interest = getAccountBalance() * interestRate / 100;
        setAccountBalance(getAccountBalance() + interest);
        System.out.println("Interest added: " + interest);
        System.out.println("New Balance: " + getAccountBalance());
    }

    // Print account information
    @Override
    public void printAccountInfo() {
        super.printAccountInfo();
        System.out.println("Interest Rate: " + interestRate);
    }


}
