// Modification - 1
// Percentage Change : 25%

public class M1T5 {

    public static void display(int[] num)
    {
        System.out.println("Displaying Number of Array:");
        for(int i = 0; i < num.length; i++)
            System.out.print(num[i] + " ");

    }
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] num = new int[10];

		for (int i = 0; i < 10; i++) {
			// Read a number
			System.out.print("Read a number: ");

			num[i] = input.nextInt();
		}
        display(num);
	}	

}
