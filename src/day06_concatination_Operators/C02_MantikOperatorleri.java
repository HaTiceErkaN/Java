package day06_concatination_Operators;

public class C02_MantikOperatorleri {

    public static void main(String[] args) {

        System.out.println(5+2==8);   //false

        boolean sonuc1= 5>4 && 7<9 && 6+3==9 && 5+2!=8 ;
        System.out.println( sonuc1);   //true

        boolean sonuc2= 5>4 && 7>9 && 6+3==9 && 5+2!=8;

        System.out.println(sonuc2);        //false

        boolean sonuc3= 5>4 & 7>9 & 6+3==9 & 5+2!=8;
        System.out.println(sonuc3);   //false

       int sayi3=15;    // sayi 3'ün 10-20 arasinda oldugunu ispatlayalim cevap true olsun

        //java 3'lü karslastırma sevmez 2'li krslastırmalar yapıp birlestirmeliyiz

        System.out.println(10<sayi3 && sayi3<20);  //true

        int sayi4=5;   // sayi4'ün 10-20 arasinda olmadigini ispatlayalim true


        System.out.println(sayi4<10 || sayi4>20);  //true











    }
}
