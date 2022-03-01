import java.util.Scanner;

public class SatuB {
    public static void main(String[] args) {        
        String ind [] = {"satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh"};
        String eng [] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kata : ");
        String kata = (input.nextLine()).toLowerCase();
        
        switch (kata) {
            case "satu" :
            System.out.println("Satu adalah " + eng[0]);
            break;
            case "one" :
            System.out.println("One adalah " + ind[0]);
            break;
            case "dua" :
            System.out.println("Dua adalah " + eng[1]);
            break;
            case "two" :
            System.out.println("Two adalah " + ind[1]);
            break;
            case "tiga" :
            System.out.println("Tiga adalah " + eng[2]);
            break;
            case "three" :
            System.out.println("Three adalah " + ind[2]);
            break;
            case "empat" :
            System.out.println("Empat adalah " + eng[3]);
            break;
            case "four" :
            System.out.println("Four adalah " + ind[3]);
            break;
            case "lima" :
            System.out.println("Lima adalah " + eng[4]);
            break;
            case "five" :
            System.out.println("Five adalah " + ind[4]);
            break;
            case "enam" :
            System.out.println("Enam adalah " + eng[5]);
            break;
            case "six" :
            System.out.println("Six adalah " + ind[5]);
            break;
            case "tujuh" :
            System.out.println("Tujuh adalah " + eng[6]);
            break;
            case "seven" :
            System.out.println("Seven adalah " + ind[6]);
            break;
            case "delapan" :
            System.out.println("Delapan adalah " + eng[7]);
            break;
            case "eight" :
            System.out.println("Eight adalah " + ind[7]);
            break;
            case "sembilan" :
            System.out.println("Sembilan adalah " + eng[8]);
            break;
            case "nine" :
            System.out.println("Nine adalah " + ind[8]);
            break;
            case "sepuluh" :
            System.out.println("Sepuluh adalah " + eng[9]);
            break;
            case "ten" :
            System.out.println("Ten adalah " + ind[9]);
            break;
            default :
            System.out.println("Maaf, kata dalam kamus tidak ada");
        }

    }
}
