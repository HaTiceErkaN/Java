package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {
        String str= "Java ile IT cok guzel";

        System.out.println(str.substring(5));  //5. indexi bulacak (i), i den sonra hepsini bize yazdiracak
        //yukardaki stringi kullanarak Mehmet hoca ie IT cok guzel yapalim

        //replace yapilabilir. java yerine mehmet hoca yazdrilir
        System.out.println(str.replace("Java", "Mehmet hoca"));
        System.out.println("Mehmet hoca "+str.substring(5));

        System.out.println(str.substring(9)); // yazilan index inclusive (dahil)

        // eger bir index'ten sona kadar olan parcayi degil belirli bir parcayi almak istersek
        // 2 parametre yazmak gerekir.
        // str.substring(baslangicIndexi, bitisIndexi)
        // baslangic indexi inclusive'dir (dahildir). Ama bitis indexi exclusive'dir (harictir)

        System.out.println(str.substring(0,5)); //Java ve bosluk yazdirir (Java )
        System.out.println(str.substring(0,1)); //J

        // bana 6. harfi string olarak bulun
        // String harf= str.charAt(4);  // charAt methodu char'a cevirir
        // dolayisiyle primitive olur. kabul etmez

        String harf= str.substring(5,6); // i yiverecek
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7));
       // System.out.println(str.substring(5,2)); // hata veriyor baslangic bitisten kucuk olamaz
        System.out.println(str.substring(str.length()-1)); //son harfi verir
        System.out.println(str.substring(str.length()-5)); // son 5 harfi yazdirir
        System.out.println(str.substring(str.length())); // son harften sonraki kismi yanihiclik verir





    }
}
