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

public class Question14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a letter grade A, B, C, D or F
		System.out.print("Enter a letter grade: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		ch = Character.toUpperCase(ch);

		if (ch >= 'A' && ch <= 'F' && ch != 'E') {
			System.out.print("The numeric value for grade " + ch + " is ");
			switch (ch) {
				case 'A':
					System.out.println(4);
					break;
				case 'B':
					System.out.println(3);
					break;
				case 'C':
					System.out.println(2);
					break;
				case 'D':
					System.out.println(1);
					break;
				case 'F':
					System.out.println(0);
			}
		} else
			System.out.println(ch + " is an invalid grade");
		input.close();
	}
}