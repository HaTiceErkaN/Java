package odevler;

import java.util.Scanner;

public class C12_SwitchStatement {
    public static void main(String[] args) {

        //Soru1 : Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen haftanin kacinci gunu oldugunu giriniz");
        int gunNo = scan.nextInt();

        switch (gunNo) {
            case 1:
                System.out.println("Girdiginiz gun numarasi: " + gunNo + " pazartesi");
                break;
            case 2:
                System.out.println("Girdiginiz gun numarasi: " + gunNo + " sali");
                break;
            case 3:
                System.out.println("Girdiginiz gun numarasi: " + gunNo + " carsamba");
                break;
            case 4:
                System.out.println("Girdiginiz gun numarasi: " + gunNo + " persembe");
                break;
            case 5:
                System.out.println("Girdiginiz gun numarasi: " + gunNo + " cuma");
                break;
            case 6:
                System.out.println("Girdiginiz gun numarasi: " + gunNo + " cumartesi");
                break;
            case 7:
                System.out.println("Girdiginiz gun numarasi: " + gunNo + " pazar");
                break;
            default:
                System.out.println("lutfen gecerli bir gun numarasi giriniz");
        }

        // Soru2 : Kullanicidan kacinci ay oldugunu sorun ve ay ismini yazdirin

        System.out.println("Lutfen kacinci ay oldugunu girin");
        int ayNo = scan.nextInt();

        switch (ayNo) {
            case 1:
                System.out.println("Girdiginiz ay numarasi: " + ayNo + " ocak");
                break;
            case 2:
                System.out.println("Girdiginiz ay numarasi: " + ayNo + " subat");
                break;
            case 3:
                System.out.println("Girdiginiz ay numarasi: " + ayNo + " mart");
                break;
            case 4:
                System.out.println("Girdiginiz ay numarasi: " + ayNo + " nisan");
                break;
            case 5:
                System.out.println("Girdiginiz ay numarasi: " + ayNo + " mayis");
                break;
            case 6:
                System.out.println("Girdiginiz ay numarasi: " + ayNo + " haziran");
                break;
            case 7:
                System.out.println("Girdiginiz ay numarasi: " + ayNo + " temmuz");
                break;
            case 8:
                System.out.println("Girdiginiz ay numarasi: " + ayNo + " agustos");
                break;
            case 9:
                System.out.println("Girdiginiz ay numarasi: " + ayNo + " eylul");
                break;
            case 10:
                System.out.println("Girdiginiz ay numarasi: " + ayNo + " ekim");
                break;
            case 11:
                System.out.println("Girdiginiz ay numarasi: " + ayNo + " kasim");
                break;
            case 12:
                System.out.println("Girdiginiz ay numarasi: " + ayNo + " aralik");
                break;

            default:
                System.out.println("lutfen gecerli bir ay numarasi giriniz");

        }

        //Soru3 : Kullanicidan bir sayi girmesini isteyin
        //Girilen sayi
        //10 ise “Iki basamakli en kucuk sayi
        //100 ise “uc basamakli en kucuk sayi”
        //1000 ise “dort basamakli en kucuk sayi”
        //diger durumlarda “Girdigin sayiyi degistir” yazdirin

        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        switch (sayi){

            case 10:
                System.out.println("Iki basamakli en kucuk sayi"); break;
            case 100:
                System.out.println("Uc basamakli en kucuk sayi"); break;
            case 1000:
                System.out.println("Dort basamakli en kucuk sayi"); break;
                default:
                    System.out.println("Girdigin sayiyiyi degistir");
        }

        //Soru4 : Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.
        //
        //Kullanici S girerse “Software”
        //D girerse “Developer”
        //E girerse “Engineer”
        //T girerse “In Testing” yazdirin

        System.out.println("Lutfen S,D,E,T harflerinden birini girin");

        char harf= scan.next().toUpperCase().charAt(0);

        switch( harf ){
            case 'S':
                System.out.println("Software"); break;
            case 'D':
                System.out.println("Developer"); break;
            case 'E':
                System.out.println("Engineer"); break;
            case 'T':
                System.out.println("In Testing"); break;
            default:
                System.out.println("Lutfen gecerli bir harf giriniz");
        }

        */
        //Soru5 : Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gunIsmi = scan.nextLine().toLowerCase();

        switch (gunIsmi) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("lutfen gecerli birgun ismi giriniz");

        }

    }
}
