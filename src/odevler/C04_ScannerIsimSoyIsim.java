package odevler;

import java.util.Scanner;

public class C04_ScannerIsimSoyIsim {
    public static void main(String[] args) {

        //5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz : Mehmet
        //Soyisminiz : Bulut
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz");
        String isim= scan.nextLine();
        String soyIsim= scan.nextLine();
        System.out.println("Isminiz: "+isim);
        System.out.println("SoyIsim: "+soyIsim);
        System.out.println("kursumuza katiliminiz alinmistir, tesekkur ederiz");


        //Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
        // Isim – soyisim : Mehmet Bulutluoz

        System.out.println("Lutfen isminizi ve soyisminizi girin");
        String ısım= scan.nextLine();
        String soyisim= scan.nextLine();
        System.out.println("Isim - soyisim : "+ısım+ " " +soyisim);

        // Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.
        System.out.println("Lutfen isminizi yaziniz");
        char ilkHarf= scan.next().charAt(0);
        System.out.println("Girdiginiz ismin ilk harfi: "+ ilkHarf);




    }
}
