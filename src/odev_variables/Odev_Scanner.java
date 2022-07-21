package odev_variables;

import java.util.Scanner;

public class Odev_Scanner {
 // 1) kullanıcıdan 2 tamsayı alıp bu sayıların toplam, fark ve carpımlarını yazdırın
 public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
     System.out.println("sayi1:");
     short sayi1= scan.nextShort();
     System.out.println("sayi2:");
     short sayi2= scan.nextShort();
     System.out.println("sayi1+sayi2:"+(sayi1+sayi2));
     System.out.println("sayi1-sayi2:"+(sayi1-sayi2));
     System.out.println("sayi1*sayi2:"+(sayi1*sayi2));

     // 2) Kullanıcıdan karenin bir kenar uzunlugunu alın ve karenin cevresini ve alanını hesaplayıp yazdirin

     System.out.println("Karenin bir kenar uzunlugu:");
     short kenarUzunlugu= scan.nextShort();
     System.out.println("Karenin cevresi:" + (kenarUzunlugu*4));
     System.out.println("Karenin alanı:"+ (kenarUzunlugu*kenarUzunlugu));

     // 3)Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin

     System.out.println("Yarıcap uzunlugu");
     double yaricap= scan.nextDouble();

     System.out.println("Cemberin cevresi:"+2*3.14*yaricap);
     System.out.println("Cemberin alanı:"+3.14*yaricap*yaricap);

     //4)Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip hacmini hesaplayın

     System.out.println("prizmanın uzunkenarı");
     System.out.println("prizmanın kısakenarı");
     System.out.println("prizmanın yüksekligi");

     double kısaKenar= scan.nextDouble();
     double uzunKenar= scan.nextDouble();
     double yükseklik= scan.nextDouble();

     System.out.println("prizmanin hacmi:"+ kısaKenar*uzunKenar*yükseklik);

     //5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
     //Isminiz : Mehmet
     //Soyisminiz : Bulut
     //Kursumuza katiliminiz alinmistir,tesekkur ederiz

     System.out.println("Isminiz:");
     System.out.println("SoyIsminiz:");

     String Isminiz= scan.nextLine();
     String SoyIsminiz= scan.nextLine();

     System.out.println("Isminiz:"+ Isminiz);
     System.out.println("SoyIsminiz:"+ SoyIsminiz);
     System.out.println("Kursumuza katiliminiz alinmistir, tesekkur ederiz.");

     //6)Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
     //Isim – soyisim : Mehmet Bulutluoz

     System.out.println("Isim:");
     System.out.println("SoyIsim:");
     String Isim= scan.nextLine();
     String SoyIsim= scan.nextLine();
     System.out.println("Isim - SoyIsim:"+Isim +" "+SoyIsim);

     //7) Kullanicidan ismini alip isminin bas harfini yazdirin.
     System.out.println("Isminiz:");
     String basHarf= scan.next();
     System.out.println("BasHarf:"+ basHarf);






















 }

}
