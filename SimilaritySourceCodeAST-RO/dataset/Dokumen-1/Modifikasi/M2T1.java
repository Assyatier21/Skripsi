// Modification - 2
// Percentage Change : 50%

import java.util.Scanner;

public class M2T1 {
	static Scanner in = new Scanner(System.in);
	private static float radius = 0;
	private static float length = 0;

	public static void main(String[] args) {
		radius = in.nextFloat();
		length = in.nextFloat();

		System.out.print("\n" + "Surface Area : " + (radius * radius * 3.14159) + "\n");
		System.out.print("Volume of the cylinder : " + (radius * radius * 3.14159 * length));
	}

}