import java.util.Scanner;

public class SatuB {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String[][] kata={
	    {"satu","one"},{"dua","two"},{"tiga","three"},
	    {"empat","four"},{"lima","five"}, {"enam","six"},{"tujuh","seven"},{"delapan","eight"},
	    {"sembilan","nine"},{"sepuluh","ten"}
	    };
	    String katadicari;

	    System.out.println("KAMUS TRANSLATE INDONESIA - INGGRIS ");
	    
	    System.out.print("MASUKAN KATA = ");
	    katadicari=in.nextLine();
	    int i,k; k=-1;
	    for(i=0;i<10;i++)
	    {
	      if(kata[i][0].equals(katadicari.toLowerCase()))
	      {
	        k=i;
	      }
	    }
	      if(k==-1)
	    {
	      System.out.print("Kata Yang Dicari Tidak Ditemukan ");
	    }
	    else
	    {
	      System.out.println("TERJEMAHAN = "+kata[k][1]);
	    }
		
		
	}
	}


