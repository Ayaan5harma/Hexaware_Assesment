package com.hexaware.bankingsystem.task11;

import java.util.HashMap;
import java.util.Map;

public class CustomerServiceProviderImpl implements ICustomerServiceProvider {
  
	protected Map<Long, Account> accounts = new HashMap<>();

    @Override
    public float get_account_balance(long accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            return account.getAccountBalance();
        } else {
            System.out.println("Account not found");
            return -1;
        }
    }
    @Override
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
    @Override
    public float withdraw(long accountNumber, float amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            if (account.getAccountBalance() >= amount) {
                account.setAccountBalance(account.getAccountBalance() - amount);
                return account.getAccountBalance();
            } else {
                System.out.println("Insufficient balance");
                return -1;
            }
        } else {
            System.out.println("Account not found");
            return -1;
        }
    }
    @Override
    public float transfer(long fromAccountNumber, long toAccountNumber, float amount) {
        Account fromAccount = accounts.get(fromAccountNumber);
        Account toAccount = accounts.get(toAccountNumber);
        if (fromAccount != null && toAccount != null) {
            if (fromAccount.getAccountBalance() >= amount) {
                fromAccount.setAccountBalance(fromAccount.getAccountBalance() - amount);
                toAccount.setAccountBalance(toAccount.getAccountBalance() + amount);
                return toAccount.getAccountBalance();
            } else {
                System.out.println("Insufficient balance");
                return -1;
            }
        } else {
            System.out.println("Account not found");
            return -1;
        }
    }
    @Override
    public void getAccountDetails(long accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Type: " + account.getAccountType());
            System.out.println("Account Balance: " + account.getAccountBalance());
            System.out.println("Customer Name: " + account.getCustomer().getFirstName() + " " + account.getCustomer().getLastName());
            System.out.println("Customer Email: " + account.getCustomer().getEmailAddress());
            System.out.println("Customer Phone Number: " + account.getCustomer().getPhoneNumber());
            System.out.println("Customer Address: " + account.getCustomer().getAddress());
        } else {
            System.out.println("Account not found");
        }
    }

}
