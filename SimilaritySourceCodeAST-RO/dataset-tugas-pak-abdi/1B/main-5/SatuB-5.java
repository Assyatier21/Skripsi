import java.util.Scanner;
public class SatuB
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String[][] kata={{"MAKAN","EAT"},{"TIDUR","SLEEP"},{"BERENANG","SWIM"},
    {"LARI","RUN"},{"PERGI","GO"},{"KETIK","TYPE"},{"KOMPUTER","COMPUTER"},{"TIKUS","MOUSE"},{"BUKU","BOOK"},{"PENA","PEN"},
    };
    String katadicari;

    System.out.println("WELCOME TO INDONESIAN-ENGLISH DICTIONARY");
    System.out.print("MASUKAN KATA = ");
    katadicari=in.nextLine();
    int i,k; k=-1;
    for(i=0;i<10;i++)
    {
      if(kata[i][0].equals(katadicari.toUpperCase()))
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