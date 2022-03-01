import java.util.Scanner;

public class SatuA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan banyak data = ");
        int n = input.nextInt();

        int data [] = new int [n];

        double total = 0;
        for(int i=0; i<data.length; i++) {
            System.out.print("Data ke-" + (i+1) + " = ");
            data [i] = input.nextInt();
            total += data[i];
        }
        double rata_Rata = total / data.length;

        double totalPangkat = 0;
        for(int i=0; i<data.length; i++) {
            double kurang = data[i] - rata_Rata;
            double pangkat = Math.pow(kurang, 2);
            totalPangkat += pangkat;
        }
        double totalBagi = totalPangkat / data.length;
        
        System.out.println("Total = " + total);
        System.out.println("Rata-rata = " + rata_Rata);
        System.out.println("Standar Deviasi = " + Math.sqrt(totalBagi));
    }
}