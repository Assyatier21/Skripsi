// Modification - 1
// Percentage Change : 25%

import java.util.Scanner;

public class M1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double radius = in.nextDouble();
		double length = in.nextDouble();

		System.out.println("Surface Area : " + (radius * radius * 3.14159));
		System.out.println("Volume of the cylinder : " + (radius * radius * 3.14159 * length));
	}

}