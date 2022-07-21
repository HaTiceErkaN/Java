package day11_stringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {
        String str= "Java Guzeldir";

        //Biz string method'larini arka arkaya kullanabiliriz
        // Mesela ikinci kelimenin ilk harfini kucuk yazdiralim

       //  str.charAt(5) boyle yazdigimizda sonuc artik string degil char olacaktir. dolayisiyla yapmak istedigimiz
        // string'de yapmak istedigimiz tum degisiklikleri once yapip sonra charAt() metho'unu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
    }
}
