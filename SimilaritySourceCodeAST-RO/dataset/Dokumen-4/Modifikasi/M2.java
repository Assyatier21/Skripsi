// Modification - 2
// Percentage Change : 50%

import java.util.Scanner;
/**
 *
 * @author B00A50C448238A71ED479F81FA4D9066
 */

public class M2
{
    public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);

        int number = input.nextInt();
		int tamp = number;
        int hit = 0;
        
        while(number != 0)
        {
            number = number / 10;
            hit++;
        }
        number = tamp;
        
        int jumlah = 0;
        for(int i = hit; i > 0; i--) {
            int jumlah10 = 1;
            int akhir = number % 10;
            for(int j = 1; j < i; j++) {
                jumlah10 = jumlah10 * 10;
            }
            jumlah = jumlah + (akhir * jumlah10);
            number = number / 10;
        }
        System.out.println(jumlah);
    }
}
