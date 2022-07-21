package day08_ifElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {
        // Eger calisan kadinsa 60 yasindan buyuk oldugunda, calisan erkekse 65 yasindan buyukse emekli olabilir
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz" +
                "\n Kadin icin K \n Erkek icin E harfini giriniz"); //  n\ satiri alta indiriyor
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();
        if (cinsiyet == 'K') {

            if (yas<0 || yas>120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol edin");
            } else if (yas<60){
                System.out.println("Emekli olamazsin \n Daha"+ (60-yas)+"yil calisman gerekir");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        } else if (cinsiyet == 'E') {
            if (yas<0 || yas>120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol edin");
            } else if (yas<65){
                System.out.println("Emekli olamazsin \n Daha"+ (65-yas)+"yil calisman gerekir");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        } else {
            System.out.println("Lutfen Cinsiyet icin bir harf giriniz");
        }
        }
    }