public class T4 {
	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		int number = input.nextInt();
		reverse(number);
	}

	public static void reverse(int number) {
		while (number != 0) {
			int remainder = number % 10;
			System.out.print(remainder);
			number = number / 10;
		}

		System.out.println();
	}

}
// T4		: 107 Token
// M1T4 	: 83 Token (23%)
// M2T4		: 172 Token (59%)
// M3T4		: 84 Token Changed (78%)
// M4T4		: 107 Token Same (100%)