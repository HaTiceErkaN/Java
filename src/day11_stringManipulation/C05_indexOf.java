package day11_stringManipulation;

import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {

        String str1= "Java bir baska guzel";

        str1.indexOf('J');
        //istersek char olarak verdigimiz bir harfin indexini dondurur
        System.out.println(str1.indexOf('J')); //0

        //istersek bir harf ya da metin olarak verdigimiz string'in indexini dondurur
        System.out.println(str1.indexOf("l")); //19
        System.out.println(str1.length()-1);  //19
        System.out.println(str1.indexOf("aska")); //10

        // ayni harften birden fazla varsa

        System.out.println(str1.indexOf("b"));  //ilk buldugu eslesmenin index'ini dondurur

        System.out.println(str1.indexOf('b',5));
        // bu method'da java aramaya fromIndex olarak yazdigimiz indexten baslar (inclusive)

        // verilen stringdeki 2. a harfinin index'ini bulalim

        int ilkindex= str1.indexOf('a');  //1 dondurecek
        System.out.println(str1.indexOf('a',ilkindex+1));

        // 20. index'ten sonra guzel aratalim

        System.out.println(str1.indexOf("guzel",20)); //31

        // String olmayan bir harf aratsak

        System.out.println(str1.indexOf("y")); // y yok demesi lazimama return type'i index yok demenin karsiligi olarak
        // java -1 dondurur

        // kullanicidan mail adresini isteyin @isareti icermiyorsa gecersiz yazdirin. iceriyorsa mailiniz kabul edildi
        // yazdirinn

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mailinizi giriniz");
        String mail= scan.next();

        if (mail.indexOf("@") == (-1)) {
            System.out.println("gecersiz");
        }else {
            System.out.println("mailiniz kabul edildi");
        }

        // OZE: indexOf methodu icerisine yazilan string veya char'ın metinde hangi indexte oldugunu bize dondurur.
        // eger aradigimiz metin veya char yoksa -1 verir







    }
}
