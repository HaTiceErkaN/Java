package day07_ifElseStatements;

import java.util.Scanner;

public class C04_HaftaiciHaftaSonu {
    public static void main(String[] args) {
 /* Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin

Ornek: gun=Pazar output = “Hafta sonu”
gun=Sali output = “Hafta ici”
  */ // ** STRİNG İİCİN EQUALS METHOD'U KULLANİN

        // Gun cumartesi veya pazar ise ===> haftasonu
        // pzt veya sali veya crs veya prs veya cuma ise ==> haftaici

        // String case sensitive'dir  yani PAZAR, Pazar, pazar bunlar hep farkli kelimelerdir
        // bu durumda string öethodlarindan yardim aliriz. Cünkü sen Stringle PAZAR yazarsin
        // kullanici pazar yazar. ssitem kabul etmez

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi = scan.next().toLowerCase();  // kullanici ne yazarsa yazsin sistem kucuk harfe cevirir
        //String ifadelerde == kullanilmasi tavsiye edilmez cunku bekledigimizden farkli sonuc verebilir

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("Girdiginiz gun hafta sonu");
        }
        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){
            System.out.println("Girdiginiz gun hafta ici");
        }
    }
}
