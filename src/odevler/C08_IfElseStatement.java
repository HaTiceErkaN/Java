package odevler;

import java.util.Scanner;

public class C08_IfElseStatement {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        // Soru 5) Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun isminin
        // 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
        //gecerli degilse “Gecerli gun ismi giriniz” yazdirin

        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi= scan.nextLine().toLowerCase();

        if (gunIsmi.equals("pazartesi")|| gunIsmi.equals("sali")|| gunIsmi.equals("carsamba")||
                gunIsmi.equals("persembe")|| gunIsmi.equals("cuma")|| gunIsmi.equals("cumartesi")||
                gunIsmi.equals("pazar")){
            System.out.println(gunIsmi.toUpperCase().charAt(0)+""+gunIsmi.toLowerCase().charAt(1)+""+
                    gunIsmi.toLowerCase().charAt(2));
        } else {
            System.out.println("lutfen gecerli bir gun giriniz");
        }

        // Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        // sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
        //isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        // sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.

        System.out.println("Lutfen 2 tamsayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        if (sayi1>0 && sayi2>0){
            System.out.println(sayi1+sayi2);
        } else if (sayi1<0 && sayi2<0){
            System.out.println(sayi1*sayi2);
        }else if (sayi1*sayi2<0){
            System.out.println("farkli isaretlere sahip sayilarla islem yapamazsiniz");
        } else if (sayi1*sayi2==0){
            System.out.println("sifir carpmaya gore yutan elemandir");
        } else {
            System.out.println("Lutfen gecerli bir sayi giriniz");
        }

        //Soru 7) Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”

        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();

        if (not<50){
            System.out.println("D");
        }else if (not<60){
            System.out.println("C");
        }else if (not<80){
            System.out.println("B");
        }else if (not<=100){
            System.out.println("A");
        }else {
            System.out.println("Lutfen gecerli bir not giriniz");
        }


    }
}
