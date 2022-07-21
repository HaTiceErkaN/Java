package odevler;

import java.util.Scanner;

public class C11_Ternary {
    public static void main(String[] args) {

        //Soru1 ) Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        System.out.println(sayi1>sayi2 ? +sayi2 : +sayi1);

        //Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin

        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi3=scan.nextInt();
        System.out.println(sayi3%2==0 ? "sayi cift":"sayi tek");

        //Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

        System.out.println("Lutfen bir sayi giriniz");
        int sayi4=scan.nextInt();

        System.out.println(sayi4<0 ? +(sayi4*(-1)) : +sayi4);

        // Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif”, negatifse sayinin karesini yazdirin

        System.out.println("Lutfen bir sayi giriniz");
        int sayi5=scan.nextInt();
        System.out.println(sayi5>0 ? "sayi pozitif": +(sayi5*sayi5));

        //Soru1 : Kullanicidan bir tamsayi alin ve sayi 10’dan kucukse “Rakam” , 100’den kucukse “iki
        //basamakli sayi”degilse “uc basamakli veya daha buyuk sayi” yazdirin

        System.out.println("Lutfen bir sayi giriniz");
        int sayi6=scan.nextInt();

        System.out.println(sayi6<10 ? "rakam": (sayi6<100 ?"iki basamakli sayi":"uc basamakli veya daha buyuk sayi"));

    }
}
