import java.util.Scanner;

public class SatuA {
    public static void main(String[] args){
        System.out.println("Program Hitung Data (ASDL).");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak data = ");
        int n = input.nextInt();
        int[] data = new int[n];

        for(int i = 0; i < data.length; i++){
            System.out.print("Data ke-" + (i+1) +": ");
            data[i] = input.nextInt();
        }

        System.out.println("Total: " + dataTotal(data));
        System.out.println("Rata-Rata: " + dataAvarage(data));
        System.out.println("Standar Deviasi: " + standarDeviasi(data));

        input.close();   
    }

    public static double dataTotal(int[] a){
        double total = 0;
        for(int i = 0; i < a.length; i++){
            total += a[i];
        }

        return total;
    }

    public static double dataAvarage(int[] a){
        double avarage = dataTotal(a) / a.length;
        return avarage;
    }

    public static double standarDeviasi(int[] a){
        double data = 0;
        for(int i = 0; i < a.length; i++){
            data = data + (Math.pow(a[i] - dataAvarage(a), 2));
        }
              
        return Math.sqrt(data / a.length);
    } 
}
