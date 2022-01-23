// Modification - 2
// Percentage Change : 50%

public class M2T5 {

    public static void display(int[] num)
    {
        System.out.println("Displaying Number of Array:");
        for(int i = 0; i < num.length; i++)
            System.out.print(num[i] + " ");

    }
    private static int[] inputArr(int[] num)
    {
        for (int i = 0; i < num.length; i++) {
			// Read a number
			System.out.print("Read a number: ");
			num[i] = input.nextInt();
		}
        return num; 
    }
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] num = new int[10];

		num = inputArr(num);
        display(num);
	}	

}
