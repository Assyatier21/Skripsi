import java.util.Scanner;

public class SatuC {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan nilai n = ");
        int n = in.nextInt();

        int matriks [][] = new int [n][n];

        for(int i=0; i<matriks.length; i++) {
            for(int j=0; j<matriks[i].length; j++) {
                matriks[0][0] = 0;
                matriks[i][0] = i;
                matriks[0][j] = j;
                if(i>0 && j>0) 
                    matriks[i][j] = matriks[i][j-1] + matriks[i-1][j];                
            }
        }

        for(int i=matriks.length-1; i>=0; i--) {
            for(int j=0; j<matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
