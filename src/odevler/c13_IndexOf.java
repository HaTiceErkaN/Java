package odevler;

import java.util.Scanner;

public class c13_IndexOf {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
        //olmadigini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir cumle yaziniz");
        String cumle= scan.nextLine().toLowerCase();

        System.out.println("Lutfen bir harf giriniz");
        String harf= scan.next().toLowerCase();

        if (cumle.indexOf(harf)==-1){
            System.out.println("harf cumlede yok");
        }else {
            System.out.println("harf cumlede var");
        }

        //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
        //kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //- Girilen kelime cumlede kullanilmamis.
        //- Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis.

        System.out.println("Lutfen bir cumle giriniz");
        String cumle1=scan.nextLine().toLowerCase();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime= scan.nextLine().toLowerCase();

        int ilkKullanim= cumle.indexOf(kelime); // eger cumlenin icinde kelime varsa index dondurur. cumlenin icinde
        // kelime yoksa -1 dondurur.  // -1 veya index cikar
        int ikinciKullanim=cumle.indexOf(kelime, ilkKullanim+1);


        if (cumle1.indexOf(kelime)==-1){
            System.out.println("Girilen kelime cumlede kullanilmamis");
        }else if (ikinciKullanim==-(-1)){
            System.out.println("istenen kelime cumlede bir kere kullanimis");
        } else{
            System.out.println("girilen kelime cumlede 1'den fazla kullanilmis");
        }

        /*

         // Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
        //olmadigini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir cumle vebir harf giriniz");
        String cumle=scan.nextLine().toLowerCase();
        String harf= scan.next().toLowerCase();


        if (cumle.indexOf(harf)==-1){
            System.out.println("Girdiginiz harf cumlede yoktur");
        }else {
            System.out.println("cumle: "+cumle +" harf: "+harf);
        }
         */


    }
}
