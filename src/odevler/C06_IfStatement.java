package odevler;

import java.util.Scanner;

public class C06_IfStatement {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        System.out.println("Lutfen bir tamsayi giriniz");
        Scanner scan = new Scanner(System.in);
        int sayi1 = scan.nextInt();
        if (sayi1 % 2 == 0) {
            System.out.println("girdiginiz sayi cift sayidir");
        }
        if (sayi1 % 2 != 0) {
            System.out.println("girdiginiz sayi tek sayidir");
        }

        /* Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini
        yazdirin
        Ornek: ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
        ilkHarf=S output = “Sali”
        *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */

        System.out.println("Lutfen gun isimlerinden birinin ilk harfini giriniz");
        String ilkHarf = scan.next().toUpperCase();

        if (ilkHarf.equals("P")) {
            System.out.println("Girdiginiz gun : pazar, pazartesi, persembe");
        } else if (ilkHarf.equals("S")) {
            System.out.println("Girdiginiz gun : sali");
        } else if (ilkHarf.equals("C")) {
            System.out.println("Girdiginiz gun: carsamba,cuma, cumartesi");
        } else {
            System.out.println("Lutfen gecerli bir harf giriniz");
        }

        /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek: gun=Pazar output = “Hafta sonu”
        gun=Sali output = “Hafta ici”
        *** String icin equals method’unu kullanin
         */

        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi = scan.next().toLowerCase();
        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe")|| gunIsmi.equals("cuma")){
            System.out.println("Girdiginiz gun haftaicidir");
        } else if (gunIsmi.equals("cumartesi")|| gunIsmi.equals("pazar")){
            System.out.println("Girdiginiz gun hafta sonudur");
        } else {
            System.out.println("Lutfen gecerli bir gun giriniz");
        }

        // Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin
        System.out.println("Lutfen kenar uzunluklarını girin");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
        double kenar4= scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar3==kenar4){
            System.out.println("Karedir");
        } else {
            System.out.println("Kare degildir");
        }

        // Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
        //ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        System.out.println("Lutfen bir gun girin");
        String gun= scan.next().toLowerCase();
        if (gun.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }else if (gun.equals("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }else if (gun.equals("pazar")){
            System.out.println("Hiristiyanlar icin kutsal gun");
        }else{
            System.out.println("Lutfen gecerli bir gun girin");
        }
    }
}
