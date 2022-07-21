package odevler;

import java.util.Scanner;

public class SifreKontrol {
    public static void main(String[] args) {

        /* Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol
        edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre
        girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        - Sifre kucuk harf icermelidir
        - Sifre buyuk harf icermelidir
        - Sifre ozel karakter icermelidir
        - Sifre en az 8 karakter olmalidir.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre= scan.next();
        boolean ozelKarakter= false;

        boolean buyukHarf= false;
        if (sifre.length() >='A'&& sifre.length() <='Z'){
            buyukHarf=true;
        }else {
            System.out.println("Sifreniz buyuk harf icermeli");
        }
        boolean kucukHarf= false;
        if (sifre.length()>='a' && sifre.length()<='z'){
            kucukHarf=true;
        }else{
            System.out.println("Sifreniz kucuk harf icermeli");
        }
        boolean uzunluk=false;
        if (sifre.length() >= 8) {
            uzunluk = true;
        } else {
            System.out.println("Sifre en az 8 karakter olmali");
        }
        }
    }
