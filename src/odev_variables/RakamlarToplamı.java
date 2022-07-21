package odev_variables;

import java.util.Scanner;

public class RakamlarToplamı {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklı bir tamsayi giriniz");
        int sayi= scan.nextInt();

        int rakam=0;
        int rakamlarToplami=0;

        // 1. adim r=0 rt=0 sayimiz=7532

        rakam=sayi%10;                  //burda son basamak olan 2'yi bulacak
        rakamlarToplami +=rakam;        // burda rakamlar toplamı 2 olacak
        sayi/=10;                       // burda 7532den 2'yi atacak =753

        rakam=sayi%10;                  // burda son basamak olan 3'ü bulacak
        rakamlarToplami +=rakam;        // burda rakamlar toplamına 3 ekleyecek = 2+3=5
        sayi/=10;                       // burda 753'den 3'ü atacak = 75

        rakam=sayi%10;                  // burda son basamak olan 5'i bulacak
        rakamlarToplami +=rakam;        //burda rakamlar toplamına 5'i ekleyecek=  2+3+5
        sayi/=10;                       // burda 75'ten 5'i atacak =7

        rakam=sayi%10;                  // burda son basamak olan 7'yi bulacak
        rakamlarToplami +=rakam;        // burda rakamlar toplamına 7 ekleyecek  2+3+5+7
        sayi/=10;                       // burda 7'den kalanı atacak =0

        System.out.println("Girdiginiz sayinin rakamlar toplami:" + rakamlarToplami);
    }
}
