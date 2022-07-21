package day14_stringManipulation;

import java.util.Scanner;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {


        // Kullanicidan 4 harfli bir kelime isteyin verilen kelimeyiilk harif buyuk digerleri kucuk olacak sekilde
        // tersten yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir kelime giriniz");

        String input=scan.next().toLowerCase();
        String tersStr=input.substring(3).toUpperCase()+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);

        System.out.println(tersStr);



    }

}
