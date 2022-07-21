package day07_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {
         /* Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
         Ornek: gun=Pazar output = “Hafta sonu”
         gun=Sali output = “Hafta ici”
          */ // ** STRİNG İCİN EQUALS METHOD'U KULLANİN

        // Gun cumartesi veya pazar ise ===> haftasonu
        // pzt veya sali veya crs veya prs veya cuma ise ==> haftaici

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi= scan.next().toUpperCase();

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")){
            System.out.println("girdiginiz gun haftasonu");
        } else {
            System.out.println("girdiginiz gun haftaici");
        }
    }
}
