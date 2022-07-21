package day06_concatination_Operators;

public class C01_Concatination {
    public static void main(String[] args) {

        String str1= "Java";
        String  str2= "Guzel";
        int sayi1=5;
        int sayi2=3;

        // variablelarin degerini degistirmeden asagidaki ifadeleri bu variableleri kullanarak yazdirin.

        //Java5Guzel

        System.out.println(str1+sayi1+str2);

        //2Guzel15

        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);

       // Java22

        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));
        //53Guzel

        System.out.println(sayi1+""+sayi2+str2); // veya (""+sayi1+sayi2+str2); yapabilirsin. "" islemi tamamini
        // toplamadan yazdirir.

        /* EGER TAMAMEN SAYİLARDAN OLUSAN BİR STRİNG VARSA VE BİZ BUNU İNT'A CEVİRMEK İSTERSEK
        Integer.valueof(str)

        BİR SAYİYİ STRİNG'E CEVİRMEK İSTERSEM
        ""+sayi

         */



    }
}
