// Modification - 1
// Percentage Change : 25%

public class M1T3
{
	public static void main(String[] args) 
    {
		System.out.println("Miles\t\tKilometers");
		System.out.println("-------------------------------");
        
		// Use for loop
        double converter = 1.609; 
        for(int i = 1; i <= 10; i++)
            System.out.println(i + "\t\t" + i * converter);
        
	}
}
