/*
	MPELE DAVID JOSUE 
	email:mpele.jusue@ictuniversity.edu.cm
	matricule: ICTU20201158
*/

import java.util.Scanner;

public class Exercise_04_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two characters
		System.out.print("Enter two characters: ");
		String str = input.nextLine();

		// Extract major and status from string
		char m = Character.toUpperCase(str.charAt(0));
		char s = str.charAt(1); 

		
		// Display the major and status represented in the character
		switch(m)
		{
			case 'M': System.out.print("Mathematics "); break;
			case 'C': System.out.print("Computer Science "); break;
			case 'I': System.out.print("Information Technology"); break;
			default : System.out.println("Invalid input");
						 System.exit(1);
		}

		switch(s)
		{
			case '1': System.out.println("Freshman"); break;
			case '2': System.out.println("Sophomore"); break;
			case '3': System.out.println("Junior"); break;
			case '4': System.out.println("Senior"); break;
			default : System.out.println("Invalid input");
		}
	}
}