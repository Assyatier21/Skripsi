import java.util.*;
import java.lang.Math;

public class SatuA {
	    public static void main(String[]args){
	        System.out.print("Masukkan banyak data = ");
	        Scanner s = new Scanner(System.in);
	        int banyakData = s.nextInt();
	        int [] data = new int[banyakData];
	        for( int i = 0; i < banyakData; i++){
	            System.out.print("Data ke "+ (i+1) +" : ");
	            data[i] = s.nextInt();
	        }
	        System.out.println("Banyak Data = " + banyakData);
	        System.out.println("Total = "+ totalData(data));
	        double rata = ratarata(totalData(data), banyakData);
	        System.out.println("Rata-Rata = " + rata );
	        System.out.println("Standar Deviasi = " + sDeviasi(data, rata, banyakData));
	    }

	    public static int totalData(int[]arr){
	        int total = 0;
	        for(int num : arr){
	            total = total + num;
	        }
	        return total;
	        
	    }
	    public static double ratarata(int arr, int banyakData){
	        double rata = 0;
	        rata = arr/banyakData;
	        return rata;
	    }
	    
	    public static double sDeviasi(int [] data, double rata, int nData) {
	    	double sDeviasi = 0;
	    	double x = 0;
	    	double sigma = 0;
	    	for (int i = 0; i < data.length; i++) {
	    		 x= Math.pow(data [i]-rata, 2);
	    		 sigma += x;
	    	}
	    	sDeviasi = Math.sqrt(sigma/nData);
	    	return sDeviasi;
	    }
}
