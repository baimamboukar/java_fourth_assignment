/*
	MPELE DAVID JOSUE 
	email:mpele.jusue@ictuniversity.edu.cm
	matricule: ICTU20201158
*/
import java.util.Scanner;

public class Exercise_04_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final double RADIUS = 6371.01;	// Constant value

		// Prompt the user to enter the latitude and longitude
		// of two points on the earth in degrees
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		String xy1 = input.nextLine();
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		String xy2 = input.nextLine();

		// Extract x and y values from string
		int k = xy1.indexOf(',');
		double x1 = Double.parseDouble(xy1.substring(0, k - 1));
		double y1 = Double.parseDouble(xy1.substring(k + 2));
		k = xy2.indexOf(',');
		double x2 = Double.parseDouble(xy2.substring(0, k - 1));
		double y2 = Double.parseDouble(xy2.substring(k + 2));

		// Convert degrees to radians
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);

		// Calculate its great circle distance
		double distance = 
			RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + 
			Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

		// Display result
		System.out.println("The distance between the two points is " + distance);
	}
}