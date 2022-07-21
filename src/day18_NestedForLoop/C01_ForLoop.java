package day18_NestedForLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

        // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
        // ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 10'dan kucuk bir sayi giriniz");

        int sayi=scan.nextInt();
        int faktoriyel=1;   // carpma oldugu icin etkisiz eleman 1 yaptik
        String faktoriyelAcikYazim="";

        // faktoriyeli bulmak istiyorsan her loop'ta her carpimdan sonra bunu icine koyacagin bir konteynar a ihtiyac
        // var. Loop baslamadan once ihityac olan konteynar olusturulmali ve deger atanmali


        for (int i = sayi; i>=1 ; i--) {
            faktoriyel*=i;

            if (i==sayi){
                faktoriyelAcikYazim=faktoriyelAcikYazim + i;
            }else {
                faktoriyelAcikYazim += "*"+i;
            }
            //System.out.println(sayi+"! ="+faktoriyel);
            // buraya for'un icine yazarsak
            /*6! =6
            6! =30
            6! =120
            6! =360
            6! =720
            6! =720

             */
        }
       System.out.println(sayi+"! ="+faktoriyelAcikYazim+" ="+faktoriyel); // burda 6!= 720 yazdiriyor



    }

}
