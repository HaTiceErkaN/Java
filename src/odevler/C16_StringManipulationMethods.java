package odevler;

public class C16_StringManipulationMethods {
    public static void main(String[] args) {
        /*

        //Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” String’ini “Java ogrenmek cok guzel.”
        // sekline getirin.

        String str1="“ Java ogrenmek123 Cok guzel@";
        System.out.println(str1);

        System.out.println(str1.replace("@","."));


        Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz

        String str1 = “$13.99”
        String str2 = “$10.55”
        ipucu : Double.parseDouble() methodunu kullanabilirsiniz.


         */

        String str2 ="$13.99";
        String str3 ="$10.55";

        str2= str2.replaceAll("\\D","");
        str3= str3.replaceAll("\\D","");

        double str2sayi= Double.valueOf(str2);
        double str3sayi= Double.valueOf(str3);

        double sonuc= (str2sayi+str3sayi)/100;
        System.out.println(sonuc+"$");



    }
}
