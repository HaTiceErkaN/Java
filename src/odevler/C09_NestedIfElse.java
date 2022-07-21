package odevler;

import java.util.Scanner;

public class C09_NestedIfElse {
    public static void main(String[] args) {
        //Kullanicidan bir sifre girmesini isteyin
        //Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
        //Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre=scan.next();

        if (sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z'){
            if (sifre.charAt(0)=='A'){
                System.out.println("Gecerli sifre");
            }else{
                System.out.println("Gecersiz sifre");
            }
        } else if (sifre.charAt(0)>='a'&& sifre.charAt(0)<='z'){
            if (sifre.charAt(0)=='z'){
                System.out.println("Gecerli sifre");
            } else{
                System.out.println("Gecersiz sifre");
            }
        }else {
            System.out.println("Lutfen gecerli sifre olması icin harf giriniz");
        }

        //Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e bölünüyorsa son rakamını kontrol edin.
        // Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı”
        // yazdırın.
        //Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

        System.out.println("Lutfen 4 basamakli bir sayi girin");
        int sayi= scan.nextInt();
        if (sayi%5==0){
            if (sayi%10==0){
                System.out.println("5'e bolunen cift sayi");
            }else{
                System.out.println("5'e bolunen tek sayi");
            }
        }else{
            System.out.println("Lutfen tekrar deneyin");
        }

        //Soru 9) Interview Question
        //Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
        //Kural 1: 4 ile bolunemeyen yillar artik yil degildir
        //Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
        //Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir

        System.out.println("Lutfen yil girin");
        int yil=scan.nextInt();

        if (sayi%4!=0){
            System.out.println("artik yil degil");
        }else if (sayi%100!=0){
            System.out.println("artik yil degil");
        }else if (sayi%400==0){
            System.out.println("artik yildir");
        }else{
            System.out.println("artik yil degildir");
        }
    }
}
