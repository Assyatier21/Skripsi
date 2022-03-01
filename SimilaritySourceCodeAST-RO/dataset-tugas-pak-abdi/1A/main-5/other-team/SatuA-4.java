import java.util.Scanner;
public class SatuA {

	public static void main(String[] args) {
		 {
		        Scanner masuk= new Scanner(System.in);
		        int i, n;
		        float jumlah, x, rata;
		        System.out.print ("Banyaknya Data: ");
		        n = masuk.nextInt();
		        jumlah=0;
		        i=1;
		        while (i<=n){
		                System.out.print ("Data ke-"+i+": ");
		                x=masuk.nextFloat ();
		                jumlah += x;
		                i++;
		        }
		        rata = jumlah / n;
		        System.out.println ("Total: "+jumlah);
		        System.out.println ("Rata-rata: "+rata);
		        
		   }
	}

}
