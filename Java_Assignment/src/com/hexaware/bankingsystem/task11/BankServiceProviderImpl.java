package com.hexaware.bankingsystem.task11;

import java.util.ArrayList;
import java.util.List;

public class BankServiceProviderImpl extends CustomerServiceProviderImpl  implements IBankServiceProvider {

	private List<Account> accountList;
    private String branchName;
    private String branchAddress;

    public BankServiceProviderImpl() {
        this.accountList = new ArrayList<>();
        this.branchName = "Main Branch";
        this.branchAddress = "123 Main St";
    }
    @Override
    public void create_account(Customer customer, long accNo, String accType, float balance) {
        Account account;
        if (accType.equals("Savings")) {
            account = new SavingAccount(customer, balance, 5.0f);
        } else if (accType.equals("Current")) {
            account = new CurrentAccount(customer, balance, 1000.0f);
        } else {
            account = new ZeroBalanceAccount(customer);
        }
        accountList.add(account);
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Account created successfully");
    }
    @Override
    public Account[] listAccounts() {
        return accountList.toArray(new Account[0]);
    }
    @Override
    public void calculateInterest() {
        for (Account account : accountList) {
            if (account instanceof SavingAccount) {
                SavingsAccount savingsAccount = (SavingsAccount) account;
                float interest = savingsAccount.getAccountBalance() * savingsAccount.getInterestRate() / 100;
                savingsAccount.setAccountBalance(savingsAccount.getAccountBalance() + interest);
                System.out.println("Interest calculated for account " + account.getAccountNumber());
            }
        }
    }

	
}
