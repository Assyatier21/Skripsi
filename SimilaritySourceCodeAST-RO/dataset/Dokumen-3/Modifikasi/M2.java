// Modification - 2
// Percentage Change : 50%

import java.util.Scanner;

public class M2
{
	public static void main(String[] args) 
    {
		Scanner in = new Scanner(System.in);

        System.out.println("Miles\t\tKilometers");
		System.out.println("-------------------------------");
                
        int k = in.nextInt();
        double converter = 1.609; 
        
        for(int i = 1; i <= k; i++)
        {
            double miles = i * converter;
            System.out.print(i + "\t\t" + miles + "\n");
        }
        
	}
}
