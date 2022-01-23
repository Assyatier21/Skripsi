// Modification - 3
// Percentage Change : 75%

import java.util.Scanner;

public class M3T5 {
    
    public static void display(int[] num)
    {
        System.out.println("Displaying Number of Array:");
        for(int i = 0; i < num.length; i++)
            System.out.print(num[i] + " ");

    }
    private static int[] inputArr(int[] num)
    {
        int k = 0;
        try{
            while(k < num.length)
            {
                System.out.print("Read a number: ");
                num[k] = input.nextInt();
                k++;

            }
        }
        catch(Exception e)
        {
            System.out.println("Wrong Input!");
        }
        return num; 
    }
	public static void main(String[] args) {
		int[] num = new int[10];
		num = inputArr(num);
        display(num);
	}	

}
