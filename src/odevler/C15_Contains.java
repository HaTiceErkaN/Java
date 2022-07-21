package odevler;

import java.util.Scanner;

public class C15_Contains {
    public static void main(String[] args) {

        /*
     Soru 1) Kullanicidan email adresini girmesini isteyin, mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,
     @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “
      @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */

        Scanner scan=new Scanner(System.in);
        /*

        System.out.println("Lutfen e-mail adresinizi giriniz");
        String mail=scan.nextLine().toLowerCase();

         */

        //Soru 2) Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum
        //cumleyi buyuk harf olarak, “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak
        //yazdirin, iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor”
        //yazdirin.

        System.out.println("Lutfen bir cumle giriniz");
        String  cumle= scan.nextLine().toLowerCase();

        if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        } else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        } else {
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }

    }
}
