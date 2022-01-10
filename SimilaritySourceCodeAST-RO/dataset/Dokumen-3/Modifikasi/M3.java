// Modification - 3
// Percentage Change : 75%

import java.util.Scanner;

public class M3
{
    public static double milesToKilos(double miles){
        return (miles * 1.609);
    }
    public static void print(int k)
    {
        for(int i = 1; i <= k; i++)
        {
            double kilos = (milesToKilos(i));
            System.out.println(" Miles : " + i +  " -->  Kilometers : " + kilos);
        }
    }
	public static void main(String[] args) 
    {
		Scanner in = new Scanner(System.in);
        int k = in.nextInt(); 
        print(k);
	}
}
