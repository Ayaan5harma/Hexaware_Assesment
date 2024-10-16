package com.hexaware.bankingsystem.task11;

public class SavingAccount extends Account {

	  
	private float interestRate;

    public void SavingsAccount(Customer customer, float accountBalance, float interestRate) {
        super(customer, "Savings", accountBalance);
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }


}
