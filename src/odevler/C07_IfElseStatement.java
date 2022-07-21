package odevler;

import java.util.Scanner;

public class C07_IfElseStatement {
    public static void main(String[] args) {


        // Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kenar uzunluklarini giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
        double kenar4= scan.nextDouble();

        if (kenar1==kenar2 && kenar3== kenar4 && kenar1==kenar3){
            System.out.println("karedir");
        } else {
            System.out.println("kare degildir");
        }

        // Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin

        System.out.println("Lutfen bir karakter giriniz");
        char karakter= scan.next().toLowerCase().charAt(0);

        if (karakter>='a'&& karakter<= 'z'){
            System.out.println("Girdiginiz karakter bir harftir");
        } else {
            System.out.println("Girdiginiz karakter harf degildir");
        }

        // Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”,
        // 65’e esit veya buyukse “Emekli olabilirsin” yazdirin

        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if (yas<65){
            System.out.println("Emekli olamazsin calismalisin");
        } else if (yas>=65){
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("lutfen gecerli bir sayi giriniz");
        }

        // Soru 5) Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun isminin
        // 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
        //gecerli degilse “Gecerli gun ismi giriniz” yazdirin

        System.out.println("Lutfen bir gun ismi giriniz");
         String gunIsmi= scan.nextLine().toLowerCase();

         if (gunIsmi.equals("pazartesi")|| gunIsmi.equals("sali")|| gunIsmi.equals("carsamba")||
                 gunIsmi.equals("persembe")|| gunIsmi.equals("cuma")|| gunIsmi.equals("cumartesi")||
                 gunIsmi.equals("pazar")){
             System.out.println(gunIsmi.toUpperCase().charAt(0)+""+ gunIsmi.toLowerCase().charAt(1)+""+
                     gunIsmi.toLowerCase().charAt(2));
         } else {
             System.out.println("lutfen gecerli bir gun giriniz");
         }





    }
}
