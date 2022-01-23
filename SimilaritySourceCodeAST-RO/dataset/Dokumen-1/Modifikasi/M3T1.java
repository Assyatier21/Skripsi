// Modification - 3
// Percentage Change : 75%

import java.util.Scanner;

public class M3T1 {
	static Scanner in = new Scanner(System.in);
	private static float radius = 0;
	private static float length = 0;
	public static float area = 0;
	public static float volume = 0;

	public static float surfaceArea()
	{
        System.out.print("Radius : ");
		radius = in.nextFloat();
		return (float)(radius * radius * 3.14159);
	}

	public static float volumeCylinder()
	{
        System.out.print("Length : ");
		length = in.nextFloat();
		return (float)(area * length);
	}

	public static void main(String[] args) {
		
		area = surfaceArea();
		volume = volumeCylinder();

		System.out.print("\n" + "Surface Area : " + (area) + "\n");
		System.out.print("Volume of the cylinder : " + (volume));
	}
}