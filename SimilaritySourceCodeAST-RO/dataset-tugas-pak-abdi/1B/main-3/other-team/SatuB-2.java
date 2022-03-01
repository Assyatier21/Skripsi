import java.util.Scanner;

public class SatuB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bahasaIndo = {"Ayam", "Beruang", "Kuda", "Badak", "Gajah",
                "Sapi", "Kambing", "Bebek", "Rusa", "Keong"};
        String hewanYangDiTranslate;
        System.out.println(bahasaIndo[1]);
        String[] bahasaInggris = {"Chicken", "Bear", "Horse", "Rhino", "Elephant",
                "Cow", "Goat", "Duck", "Deer", "Snail"};
        String  hewanYangDiTranslateJuga;
        System.out.println(bahasaInggris[1]);
        int jenisKamus;
        

        do{
            System.out.print("Pilih jenis kamus :\n1. Indonesia-Inggris\n2. Inggris-Indonesia\n0. Keluar\nPilihan (1/2/0) ");
            System.out.print("Pilihan anda: ");
            jenisKamus = scanner.nextInt();    
            switch (jenisKamus) {
                case 1:
                    System.out.println("Masukkan nama hewan yang ingin di translate : ");
                    hewanYangDiTranslate = scanner.next();
                    switch (hewanYangDiTranslate) {
                        case "Ayam", "ayam":
                            System.out.println("Bahasa Inggris dari " + bahasaIndo[0] + " adalah " + bahasaInggris[0] + ".");
                            break;
                        case "Beruang", "beruang":
                            System.out.println("Bahasa Inggris dari " + bahasaIndo[1] + " adalah " + bahasaInggris[1] + ".");
                            break;
                        case "Kuda", "kuda":
                            System.out.println("Bahasa Inggris dari " + bahasaIndo[2] + " adalah " + bahasaInggris[2] + ".");
                            break;
                        case "Badak", "badak":
                            System.out.println("Bahasa Inggris dari " + bahasaIndo[3] + " adalah " + bahasaInggris[3] + ".");
                            break;
                        case "Gajah", "gajah":
                            System.out.println("Bahasa Inggris dari " + bahasaIndo[4] + " adalah " + bahasaInggris[4] + ".");
                            break;
                        case "Sapi", "sapi":
                            System.out.println("Bahasa Inggris dari " + bahasaIndo[5] + " adalah " + bahasaInggris[5] + ".");
                            break;
                        case "Kambing", "kambing":
                            System.out.println("Bahasa Inggris dari " + bahasaIndo[6] + " adalah " + bahasaInggris[6] + ".");
                            break;
                        case "Bebek", "bebek":
                            System.out.println("Bahasa Inggris dari " + bahasaIndo[7] + " adalah " + bahasaInggris[7] + ".");
                            break;
                        case "Rusa", "rusa":
                            System.out.println("Bahasa Inggris dari " + bahasaIndo[8] + " adalah " + bahasaInggris[8] + ".");
                            break;
                        case "Keong", "keong":
                            System.out.println("Bahasa Inggris dari " + bahasaIndo[9] + " adalah " + bahasaInggris[9] + ".");
                            break;
                        default:
                            System.out.println("Maaf, kata tersebut tidak termasuk dalam kamus(Sorry, that word is not included" +
                                    " in this dictionary.)");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan nama hewan yang ingin di translate : ");
                    hewanYangDiTranslateJuga = scanner.next();
                    switch (hewanYangDiTranslateJuga) {
                        case "Chicken", "chicken":
                            System.out.println("Bahasa Indonesia dari " + bahasaInggris[0] + " adalah " + bahasaIndo[0] + ".");
                            break;
                        case "Bear", "bear":
                            System.out.println("Bahasa Indonesia dari " + bahasaInggris[1] + " adalah " + bahasaIndo[1] + ".");
                            break;
                        case "Horse", "horse":
                            System.out.println("Bahasa Indonesia dari " + bahasaInggris[2] + " adalah " + bahasaIndo[2] + ".");
                            break;
                        case "Rhino", "rhino":
                            System.out.println("Bahasa Indonesia dari " + bahasaInggris[3] + " adalah " + bahasaIndo[3] + ".");
                            break;
                        case "Elephant", "elephant":
                            System.out.println("Bahasa Indonesia dari " + bahasaInggris[4] + " adalah " + bahasaIndo[4] + ".");
                            break;
                        case "Cow", "cow":
                            System.out.println("Bahasa Indonesia dari " + bahasaInggris[5] + " adalah " + bahasaIndo[5] + ".");
                            break;
                        case "Goat", "goat":
                            System.out.println("Bahasa Indonesia dari " + bahasaInggris[6] + " adalah " + bahasaIndo[6] + ".");
                            break;
                        case "Duck", "duck":
                            System.out.println("Bahasa Indonesia dari " + bahasaInggris[7] + " adalah " + bahasaIndo[7] + ".");
                            break;
                        case "Deer", "deer":
                            System.out.println("Bahasa Indonesia dari " + bahasaInggris[8] + " adalah " + bahasaIndo[8] + ".");
                            break;
                        case "Snail", "snail":
                            System.out.println("Bahasa Indonesia dari " + bahasaInggris[9] + " adalah " + bahasaIndo[9] + ".");
                            break;
                        default:
                            System.out.println("Maaf, kata tersebut tidak termasuk dalam kamus(Sorry, that word is not included" +
                                    " in this dictionary.)");
                    }
                    break;
            }
        }while(jenisKamus != 0);
        
        scanner.close();
    }
}

