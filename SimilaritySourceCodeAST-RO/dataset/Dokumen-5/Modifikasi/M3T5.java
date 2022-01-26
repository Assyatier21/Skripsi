// Modification - 3
// Percentage Change : 75%

import java.util.Scanner;

public class M3T5 {
    static Scanner input = new Scanner(System.in);
    private static int length = 0;

    public static void display(int[] num)
    {
        System.out.println("Displaying Number of Array:");
        for(int i = 0; i < num.length; i++)
            System.out.print(num[i] + " ");

    }
    private static int[] inputArr(int[] num)
    {
        int k = 0;
            while(k < num.length)
            {
                String number = "";
                System.out.print("Read a number: ");
                number = input.next();
                num[k] = Integer.valueOf(number);
                k++;
            }
        return num; 
    }
	public static void main(String[] args) {
		System.out.print("Enter length of Array:" );
        length = input.nextInt();

        int[] num = new int[length];
		num = inputArr(num);
        display(num);
	}	

}
