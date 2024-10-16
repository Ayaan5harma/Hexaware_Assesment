package com.hexaware.bankingsystem.task11;

import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
        BankServiceProviderImpl bank = new BankServiceProviderImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Banking System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Get Account Balance");
            System.out.println("6. Get Account Details");
            System.out.println("7. List Accounts");
            System.out.println("8. Calculate Interest");
            System.out.println("9. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            switch (option) {
            case 1:
                createAccount(bank, scanner);
                break;
            case 2:
                deposit(bank, scanner);
                break;
            case 3:
                withdraw(bank, scanner);
                break;
            case 4:
                transfer(bank, scanner);
                break;
            case 5:
                getAccountBalance(bank, scanner);
                break;
            case 6:
                getAccountDetails(bank, scanner);
                break;
            case 7:
                listAccounts(bank);
                break;
            case 8:
                calculateInterest(bank);
                break;
            case 9:
                System.exit(0);
            default:
                System.out.println("Invalid option");
        }
    }
}

	   private static void createAccount(BankServiceProviderImpl bank, Scanner scanner) {
	        System.out.print("Enter customer first name: ");
	        String customerfirstName = scanner.next();
	        System.out.print("Enter customer last name: ");
	        String customerlastName = scanner.next();
	        System.out.print("Enter customer email: ");
	        String customerEmail = scanner.next();
	        System.out.print("Enter customer phone number: ");
	        String customerPhoneNumber = scanner.next();
	        System.out.print("Enter customer address: ");
	        String customerAddress = scanner.next();
	        System.out.print("Enter account type (Savings/Current/ZeroBalance): ");
	        String accountType = scanner.next();
	        System.out.print("Enter initial balance: ");
	        float initialBalance = scanner.nextFloat();
	      
	        Customer customer = new Customer(1, customerfirstName,customerlastName, customerEmail, customerPhoneNumber, customerAddress);
	        bank.create_account(customer, 0, accountType, initialBalance);
	    }
	   private static void deposit(BankServiceProviderImpl bank, Scanner scanner) {
	        System.out.print("Enter account number: ");
	        long accountNumber = scanner.nextLong();
	        System.out.print("Enter amount to deposit: ");
	        float amount = scanner.nextFloat();

	        float balance = bank.deposit(accountNumber, amount);
	        if (balance != -1) {
	            System.out.println("Deposit successful. New balance: " + balance);
	        }
	    }
	   private static void withdraw(BankServiceProviderImpl bank, Scanner scanner) {
	        System.out.print("Enter account number: ");
	        long accountNumber = scanner.nextLong();
	        System.out.print("Enter amount to withdraw: ");
	        float amount = scanner.nextFloat();

	        float balance = bank.withdraw(accountNumber, amount);
	        if (balance != -1) {
	            System.out.println("Withdrawal successful. New balance: " + balance);
	        }
	    }
	   private static void transfer(BankServiceProviderImpl bank, Scanner scanner) {
	        System.out.print("Enter from account number: ");
	        long fromAccountNumber = scanner.nextLong();
	        System.out.print("Enter to account number: ");
	        long toAccountNumber = scanner.nextLong();
	        System.out.print("Enter amount to transfer: ");
	        float amount = scanner.nextFloat();

	        float balance = bank.transfer(fromAccountNumber, toAccountNumber, amount);
	        if (balance != -1) {
	            System.out.println("Transfer successful. New balance: " + balance);
	        }
	    }
	   private static void getAccountBalance(BankServiceProviderImpl bank, Scanner scanner) {
	        System.out.print("Enter account number: ");
	        long accountNumber = scanner.nextLong();

	        float balance = bank.get_account_balance(accountNumber);
	        if (balance != -1) {
	            System.out.println("Account balance: " + balance);
	        }
	    }

	    private static void getAccountDetails(BankServiceProviderImpl bank, Scanner scanner) {
	        System.out.print("Enter account number: ");
	        long accountNumber = scanner.nextLong();

	        bank.getAccountDetails(accountNumber);
	    }
	    private static void listAccounts(BankServiceProviderImpl bank) {
	        Account[] accounts = bank.listAccounts();
	        for (Account account : accounts) {
	            System.out.println("Account Number: " + account.getAccountNumber());
	            System.out.println("Account Type: " + account.getAccountType());
	            System.out.println("Account Balance: " + account.getAccountBalance());
	            System.out.println("Customer Name: " + account.getCustomer().getFirstName() + " " + account.getCustomer().getLastName());
	            System.out.println("Customer Email: " + account.getCustomer().getEmailAddress());
	            System.out.println("Customer Phone Number: " + account.getCustomer().getPhoneNumber());
	            System.out.println("Customer Address: " + account.getCustomer().getAddress());
	            System.out.println();
	        }
	    }
	    private static void calculateInterest(BankServiceProviderImpl bank) {
	        bank.calculateInterest();
	        System.out.println("Interest calculated for all accounts");
	    }

}
