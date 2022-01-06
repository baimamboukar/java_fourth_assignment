package com.baimamboukar.java.fourth_assignment.src;

/**
 * COURSE: JAVA PROGRAMMING I | ICT UNIVERSITY | FALL 2021
 * INSTRUCTOR: Eng. DANIEL MOUNE
 * ..................................................................
 * ⚝ NAME: BAIMAM BOUKAR JEAN JACQUES
 * ⚝ MATRIC NO: ICTU20201685
 * ⚝ EMAIL: baimamboukar@gmail.com
 * ⚝ GITHUB: github.com/baimamboukar
 * ⚝ LINKEDIN: linkedin.com/in/baimamboukar
 * ..................................................................
 */

import java.util.Scanner;

public class Question26 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter an amount, for example 11.56: ");
		String amount = input.nextLine();

		// Extract number of dollars
		String numberOfOneDollars = amount.substring(0, amount.indexOf('.'));

		// Extract cents
		int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

		// Find the number of quarters
		int numberOfQuarters = cents / 25;
		cents %= 25;

		// Find the number of dimes
		int numberOfDimes = cents / 10;
		cents %= 10;

		// Find the number of nickels
		int numberOfNickels = cents / 5;
		cents %= 5;

		// Display results
		System.out.println("Your amount " + amount + " consists of\n "
				+ numberOfOneDollars + " dollars\n "
				+ numberOfQuarters + " quarters\n "
				+ numberOfDimes + " dimes\n "
				+ numberOfNickels + " nickels\n "
				+ cents + " pennies\n ");
		input.close();
	}
}