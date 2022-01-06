/*
	MPELE DAVID JOSUE 
	email:mpele.jusue@ictuniversity.edu.cm
	matricule: ICTU20201158
*/
import java.util.Scanner;

public class Exercise_04_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a letter grade A, B, C, D or F
		System.out.print("Enter a letter grade: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		ch = Character.toUpperCase(ch);
		
		if (ch >= 'A' && ch <= 'F' && ch != 'E')
		{
			System.out.print("The numeric value for grade " + ch + " is ");
			switch(ch)
			{
				case 'A': System.out.println(4); break;
				case 'B': System.out.println(3); break;
				case 'C': System.out.println(2); break;
				case 'D': System.out.println(1); break;
				case 'F': System.out.println(0); 
			}
		}
		else
			System.out.println(ch + " is an invalid grade");
	}
}