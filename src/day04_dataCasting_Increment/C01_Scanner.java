package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        //Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi girin...");
        char ilkHarf= scan.next().charAt(0);

        //charAt(index) methodu parametre olarak yazdığımız indexteki char'ı bize getirir.
        // Neden 1 değil de 0 = String'de index 0'dan başlar

        System.out.println("Girdiginiz ismin ilk harfi:"+ ilkHarf);

    }
}
