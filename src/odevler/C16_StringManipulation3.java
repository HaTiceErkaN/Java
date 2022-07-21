package odevler;

import java.util.Scanner;

public class C16_StringManipulation3 {

    public static void main(String[] args) {

        //Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String isim= scan.nextLine();

        System.out.println("Lutfen soyadinizi giriniz");
        String soyIsim= scan.nextLine();

        if (isim.length()>soyIsim.length()){
            System.out.println(isim);
        }else if (isim.length()<soyIsim.length()){
            System.out.println(soyIsim);
        }
    }
}
