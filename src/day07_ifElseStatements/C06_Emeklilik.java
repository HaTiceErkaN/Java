package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

        // kullanicidan yasini isteyin 65+ ise emekli olabilirsin, 65- emekli olamazsin yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("Emekli olamazsin");
            System.out.println(65-yas+ " sene daha calismalisin");
        }

        // if else statementlarda iki durumdan sadece ve sadece biri calisir.
        // ikisinin birden calisma ihtimali yok. ikisinin de calismama ihtimali yok
    }
}
