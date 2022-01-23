// Modification - 1
// Percentage Change : 25%

import java.util.Scanner;

public class M1T4
{
    public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);

        int number = input.nextInt();
		while (number != 0) 
        {
			int remainder = number % 10;
			System.out.print(remainder);
			number = number / 10;
		}
    }
}
