package com.hexaware.bankingsystem.task9;

import java.util.Scanner;

public class Bank {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Select account type:");
	        System.out.println("1. Savings Account");
	        System.out.println("2. Current Account");

	        int choice = scanner.nextInt();

	        BankAccount account = null;

	        switch (choice) {
            case 1:
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();
                System.out.print("Enter customer name: ");
                String customerName = scanner.next();
                System.out.print("Enter initial balance: ");
                double balance = scanner.nextDouble();
                System.out.print("Enter interest rate (%): ");
                double interestRate = scanner.nextDouble();

                account = new SavingAccount(accountNumber, customerName, balance, interestRate);
                break;
            case 2:
                System.out.print("Enter account number: ");
                accountNumber = scanner.nextInt();
                System.out.print("Enter customer name: ");
                customerName = scanner.next();
                System.out.print("Enter initial balance: ");
                balance = scanner.nextDouble();

                account = new CurrentAccount(accountNumber, customerName, balance);
                break;
            default:
                System.out.println("Invalid choice");
        }
	        if (account != null) {
	            while (true) {
	                System.out.println("Select operation:");
	                System.out.println("1. Deposit");
	                System.out.println("2. Withdraw");
	                System.out.println("3. Calculate interest");
	                System.out.println("4. Print account info");
	                System.out.println("5. Exit");

	                choice = scanner.nextInt();

	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter amount to deposit: ");
	                        float depositAmount = scanner.nextFloat();
	                        account.deposit(depositAmount);
	                        break;
	                    case 2:
	                        System.out.print("Enter amount to withdraw: ");
	                        float withdrawAmount = scanner.nextFloat();
	                        account.withdraw(withdrawAmount);
	                        break;
	                    case 3:
	                    	 account.calculateInterest();
	                         break;
	                     case 4:
	                         account.printAccountInfo();
	                         break;
	                     case 5:
	                         System.exit(0);
	                         break;
	                     default:
	                         System.out.println("Invalid choice");
	                 }
	             }
	         }
	     }

}
