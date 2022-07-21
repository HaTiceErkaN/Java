package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen cemberin yarıcapını giriniz");
        double yarıcap= scan.nextDouble();

        System.out.println("girdiginiz yarıcap: " + yarıcap);
        System.out.println("cemberin cevresi: " + 2*3.14*yarıcap);
        System.out.println("dairenin alanı:" +3.14*yarıcap*yarıcap);



    }
}
