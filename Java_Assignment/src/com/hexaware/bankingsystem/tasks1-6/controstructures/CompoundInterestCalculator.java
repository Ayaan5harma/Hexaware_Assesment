package com.hexaware.bankingsystem.tasks.controstructures;

import java.util.Scanner;

public class CompoundInterestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();

        for (int i = 1; i <= numCustomers; i++) {
            System.out.println("\nCustomer " + i + ":");

            System.out.print("Enter initial balance: $");
            double initialBalance = scanner.nextDouble();

            System.out.print("Enter annual interest rate (%): ");
            double annualInterestRate = scanner.nextDouble();

            System.out.print("Enter number of years: ");
            int years = scanner.nextInt();

            double futureBalance = calculateFutureBalance(initialBalance, annualInterestRate, years);

            System.out.printf("Future balance after %d years: $%.2f%n", years, futureBalance);
        }

        scanner.close();
    }

    private static double calculateFutureBalance(double initialBalance, double annualInterestRate, int years) {
        return initialBalance * Math.pow((1 + annualInterestRate / 100), years);
    }
}
