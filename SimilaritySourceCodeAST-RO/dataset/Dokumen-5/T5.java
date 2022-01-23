    public class T5 {
        public static void main(String[] args) {
            java.util.Scanner input = new java.util.Scanner(System.in);
            int[] num = new int[10];

            for (int i = 0; i < 10; i++) {
                // Read a number
                System.out.print("Read a number: ");

                num[i] = input.nextInt();
            }

            // Display the array
            for (int i = 9; i >= 0; i--) {
                System.out.println(num[i]);
            }
        }	

    }

    // M1   : 115 Token
    // M1T5 : 28 Token Modified 
    // M2T5 : 56 Token Modified
    // M3T5 : 92 Token Modified