package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //1. adım scanner oluşturmak

        Scanner scan = new Scanner(System.in);

        //2. adım kullanıcıdan istediğimiz degeri girmesi icin acıklayıcı bir bilgi yazdır

        System.out.println("Lutfen isminizi giriniz");

        //3. adım kullanıcının girdigi degeri uygun bir variable olusturup kaydet

        // scan.next methodu sadece ilk kelimeyi alır. ilk space'e kadar olan yer.

        String kullaniciIsmi=scan.nextLine();
        System.out.println("Kullanicinin girdigi isim: "+ kullaniciIsmi);





    }
}
