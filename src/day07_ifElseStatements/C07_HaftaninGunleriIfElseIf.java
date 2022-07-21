package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {
    public static void main(String[] args) {

         /* Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
         Eger kulanici gun ismini yanlis girerse yanlis giris yazdirin
         Ornek: gun=Pazar output = “Hafta sonu”
         gun=Sali output = “Hafta ici”
          */ // ** STRİNG İCİN EQUALS METHOD'U KULLANİN

        // Gun cumartesi veya pazar ise ===> haftasonu
        // pzt veya sali veya crs veya prs veya cuma ise ==> haftaici

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi = scan.next().toLowerCase();

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gun hafta sonu");

        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {
            System.out.println("girdiginiz gun hafta ici");

        } else {
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }
        // eger if else if... statementta else ile bitiyorsa olasiliklardan sadece bir tanesi mutlaka calisir.
        // java ilk buldugu true ya ait sonucu yazdirir ve kalan sartlara bakmaz.

        // if else if .. cumleleri else ie bitmese de calisir ancak bu durumda sadece bir olasilik calisabilir veya
        // hicbir islem yapilmayabilir.
    }
}

