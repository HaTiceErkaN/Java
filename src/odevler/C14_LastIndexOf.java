package odevler;

import java.util.Scanner;

public class C14_LastIndexOf {
    public static void main(String[] args) {

        /*
        Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
        kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin

        - Girilen kelime cumlede kullanilmamis.
        - Girilen kelime cumlede 1 kere kullanilmis.
        - Girilen kelime cumlede 1’den fazla kullanilmis.
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String c=scan.nextLine().toLowerCase();
        System.out.println("Lutfen bir kelime giriniz");
        String k= scan.nextLine().toLowerCase();

        int indexKelime=c.indexOf(k);
        int lastIndexKelime=c.lastIndexOf(k);

        if (c.indexOf(k)==-1){
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        }else if (indexKelime==lastIndexKelime){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        }else if (indexKelime!=lastIndexKelime){
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }








    }
}
