import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class SatuB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hasil = 0;
		int i;
		Scanner input = new Scanner(System.in);
		String en[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
		String ind[]= {"satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh"};
		System.out.print("masukkan kata: ");
		String masukkan = input.nextLine();
		
		
		for(i=0; i<ind.length; i++) {
			if(masukkan.equalsIgnoreCase(ind[i])) {
				hasil=i;
			}
			if(masukkan.equalsIgnoreCase(en[i])) {
				hasil=i;
			}
		}
		if (masukkan.equals(en[hasil])|| masukkan.equals(ind[hasil])) {
		System.out.println(ind[hasil]+" adalah "+ en[hasil]);
		
		}
		else {
			System.out.println("Maaf kata tidak ditemukan. Coba kembali");
		}
		
	}

}
