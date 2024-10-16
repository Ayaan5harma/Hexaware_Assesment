package com.hexaware.bankingsystem.task10;

import java.util.HashMap;
import java.util.Map;

public class Bank {
   
	private Map<Long, Account> accounts;
	private long accountNumberCounter;

	public Bank() {
	    this.accounts = new HashMap<>();
	    this.accountNumberCounter = 1001;
	}
	public void createAccount(Customer customer, String accountType, float balance) {
	    Account account;
	    if (accountType.equals("Savings")) {
	        account = new SavingAccount(accountNumberCounter, accountType, balance, customer, 5.0f);
	    } else {
	        account = new CurrentAccount(accountNumberCounter, accountType, balance, customer, 1000.0f);
	    }
	    accounts.put(accountNumberCounter, account);
	    accountNumberCounter++;
	}
	public float getAccountBalance(long accountNumber) {
	    Account account = accounts.get(accountNumber);
	    if (account != null) {
	        return account.getAccountBalance();
	    } else {
	        System.out.println("Account not found");
	        return -1;
	    }
	}

	public float deposit(long accountNumber, float amount) {
	    Account account = accounts.get(accountNumber);
	    if (account != null) {
	        account.setAccountBalance(account.getAccountBalance() + amount);
	        return account.getAccountBalance();
	    } else {
	        System.out.println("Account not found");
	        return -1;
	    }
	}
	public float withdraw(long accountNumber, float amount) {
	    Account account = accounts.get(accountNumber);
	    if (account != null) {
	        if (account instanceof SavingAccount) {
	            if (account.getAccountBalance() >= amount) {
	                account.setAccountBalance(account.getAccountBalance() - amount);
	                return account.getAccountBalance();
	            } else {
	                System.out.println("Insufficient balance");
	                return -1;
	            }
	        } else {
	            CurrentAccount currentAccount = (CurrentAccount) account;
	            if (account.getAccountBalance() + currentAccount.getOverdraftLimit() >= amount) {
	                account.setAccountBalance(account.getAccountBalance() - amount);
	                return account.getAccountBalance();
	            } else {
	                System.out.println("Withdrawal exceeds overdraft limit");
	                return -1;
	            }
	        }
	    }else {
	        System.out.println("Account not found");
	        return -1;
	    }
	}
	public float transfer(long fromAccountNumber, long toAccountNumber, float amount) {
	    Account fromAccount = accounts.get(fromAccountNumber);
	    Account toAccount = accounts.get(toAccountNumber);
	    if (fromAccount != null && toAccount != null) {
	        float balance = withdraw(fromAccountNumber, amount);
	        if (balance != -1) {
	            deposit(toAccountNumber, amount);
	            return balance;
	        }
	    } else {
	        System.out.println("Account not found");
	        return -1;
	    }
	    return -1;
	}
	public void getAccountDetails(long accountNumber) {
	    Account account = accounts.get(accountNumber);
	    if (account != null) {
	        account.printAccountInfo();
	    } else {
	        System.out.println("Account not found");
	    }
	}

}
