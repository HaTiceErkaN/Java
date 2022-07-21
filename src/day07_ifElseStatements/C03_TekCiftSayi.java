package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

        // Kullanicidan bir tamsayiisteyin ve sayinin tek veya cift oldugunu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Girilen sayi cift sayidir");

            }
        if (sayi%2!=0){
            System.out.println("Girilen sayi tek sayi");
        }
        if (sayi%2==0){
            System.out.println("Girdiginiz sayi cift sayidir");
        } else {
            System.out.println("Girdiginiz sayi tek sayidir");
        }
    }
}
