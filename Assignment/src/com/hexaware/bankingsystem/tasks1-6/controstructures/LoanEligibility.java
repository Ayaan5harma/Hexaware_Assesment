package com.hexaware.bankingsystem.tasks.controstructures;

import java.util.Scanner;

public class LoanEligibility {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your credit score: ");
	        int creditScore = scanner.nextInt();

	        System.out.print("Enter your annual income: $");
	        double annualIncome = scanner.nextDouble();

	        if (creditScore >= 700 && annualIncome >= 50000) {
	            System.out.println("Congratulations! You are eligible for a loan.");
	        } else {
	            System.out.println("Sorry, you are not eligible for a loan.");
	            if (creditScore < 700) {
	                System.out.println("Your credit score is too low. Minimum required is 700.");
	            }
	            if (annualIncome < 50000) {
	                System.out.println("Your annual income is too low. Minimum required is $50,000.");
	            }
	        }

	        scanner.close();
	    }


	}


