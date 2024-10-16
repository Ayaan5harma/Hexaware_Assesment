package com.hexaware.bankingsystem.task8;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");

        int choice = scanner.nextInt();

        Account account = null;

        switch (choice) {
            case 1:
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();
                System.out.print("Enter initial balance: ");
                double initialBalance = scanner.nextDouble();
                System.out.print("Enter interest rate (%): ");
                double interestRate = scanner.nextDouble();

                account = new SavingAccount(accountNumber, "Savings", initialBalance, interestRate);
                break;
            case 2:
                System.out.print("Enter account number: ");
                accountNumber = scanner.nextInt();
                System.out.print("Enter initial balance: ");
                initialBalance = scanner.nextDouble();

                account = new CurrentAccount(accountNumber, "Current", initialBalance);
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
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
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
