// Modification - 3
// Percentage Change : 75%

import java.util.Scanner;

public class M3T4 {
	private static int number;
    public static String reversedNum;

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("----[ Reverse Number Program ]----");
        System.out.println("* This program will print your input number from behind");
        System.out.println("* Don't Enter Zero as a First Number");
        
        System.out.println("Enter an integer: ");
		number = input.nextInt();
		reversedNum = reverse(number);
        
        System.out.println("Reversed Numnber: ");    
        System.out.println(reversedNum);

	}

	private static String reverse(int number)
    {
        String res = "";
    	while (number != 0) {
			int remainder = number % 10;
            res += remainder;
			number = number / 10;
		}
		System.out.println();
        return res;
	}

}