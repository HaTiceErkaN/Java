package odev_variables;

import java.util.Scanner;

public class Odev_2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        // Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz : Mehmet
        //Soyisminiz : Bulut
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz

        System.out.println("Isminiz:");
        System.out.println("SoyIsminiz:");

        String Isminiz= scan.nextLine();
        String SoyIsminiz= scan.nextLine();

        //Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
        //Isim – soyisim : Mehmet Bulutluoz

        System.out.println("Isim - SoyIsim:");
        String Isim= scan.nextLine();
        String SoyIsim= scan.nextLine();
        System.out.println("Isim - SoyIsim:"+Isim +" "+SoyIsim);

        // //7) Kullanicidan ismini alip isminin bas harfini yazdirin.
        System.out.println("lutfen isminizi yazin");
        char isim=scan.next().toUpperCase().charAt(0);
        System.out.println(isim);

    }
}
