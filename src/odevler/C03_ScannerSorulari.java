package odevler;

import java.util.Scanner;

public class C03_ScannerSorulari {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Sayi1: ");
        System.out.println("Sayi2: ");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        System.out.println("sayi1+sayi2: "+ (sayi1+sayi2));
        System.out.println("sayi1*sayi2: "+ sayi1*sayi2);
        System.out.println("sayi1-sayi2: "+ (sayi1-sayi2));

        //Soru 2) Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin

        System.out.println("Lutfen karenin kenar uzunlugunu giriniz");
        double kenarUzunlugu= scan.nextDouble();
        System.out.println("Karenin cevresi: "+ (4*kenarUzunlugu));
        System.out.println("Karenin alanı: "+ (kenarUzunlugu*kenarUzunlugu));

        // Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        System.out.println("Lutfen yaricap giriniz");
        double yaricap= scan.nextDouble();
        System.out.println("Cemberin cevresi: "+ (2*3.14*yaricap));
        System.out.println("Cemberin alanı: "+ (2.14*yaricap*yaricap));

        // Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip prizmanin
        // hacmini hesaplayip yazdirin

        System.out.println("Kısa kenar: ");
        System.out.println("Uzun kenar: ");
        System.out.println("Yukseklik: ");
        double kısaKenar= scan.nextDouble();
        double uzunKenar= scan.nextDouble();
        double yukseklik= scan.nextDouble();
        System.out.println("Prizmanin hacmi: "+ (kısaKenar*uzunKenar*yukseklik));

        //5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz : Mehmet
        //Soyisminiz : Bulut
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz

        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();
        String soyIsim= scan.nextLine();
        System.out.println("Isminiz: "+isim);
        System.out.println("SoyIsim:"+soyIsim);
        System.out.println("kursumuza katiliminiz alinmistir, tesekkur ederiz");





    }
}
