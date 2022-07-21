package day10_switch_StringManipulation;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {

        // kullanicidan sayi olarak kacinci ay oldugunu alip  ay ismini yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
         int ayNo= scan.nextInt();

         // bu soru if else ile de yapilabilir ama 13 tane durum (if else) girmek gerekir. karisabilir

        switch (ayNo){

            case 1:
                System.out.println("ocak");break;
            case 2:
                System.out.println("subat");break;
            case 3:
                System.out.println("mart"); break;
            case 4:
                System.out.println("nisan");break;
            case 5:
                System.out.println("mayis");break;
            case 6:
                System.out.println("haziran");break;
            case 7:
                System.out.println("temmuz");break;
            case 8:
                System.out.println("agustos");break;
            case 9:
                System.out.println("eylul");break;
            case 10:
                System.out.println("ekim");break;
            case 11:
                System.out.println("kasim");break;
            case 12:
                System.out.println("aralik");break;
                default:
                    System.out.println("lutfen gecerli bir ay numarasi giriniz");

                // break (kirmak demek) tamamini yazmasini engeller sadece istenen satirda kalir

            // if elseteki gibi kalan durumlari tamamen kapsayacak bir satir daha ekleyebiliriz.



        }
    }
}
