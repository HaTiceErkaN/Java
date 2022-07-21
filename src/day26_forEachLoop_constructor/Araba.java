package day26_forEachLoop_constructor;

public class Araba {
    /*
     Java'da her class oluşturduğumuzda java o class'an ilerde objeler üretmek gerekeceğini bilir. Ve biz özellikle
     belirtmesek de java her olusturduğu class'a bir constructor koyar.

     Java'nın Class olustururken clas'a koydugu constructor'a DEFAULT CONSTRUCTOR denir ve bu constructor görünmez.
     Eğer biz görünür bir constructor'imiz olsun istersek default constructor ile ayni görevi yapan bir constructor
     olusturbiliriz veya istersek ayni kaliptan farkli desenlerde objeler olusturmak icin farki özelliklerde
     constructorlar'da olusturabiliriz.
     Constructor'lari birbirinden farklilaştiran tek ayricalik kullanilan parametre sayisi ve parametre data türüdür.
     */
    public Araba(){  //Bu bir constructor. fakat parametreli bir constructor değildir
        System.out.println("Parametresiz consturctor calisti");

    }
    // Bir kod bloğunun method veya constructor olmasindan emin olmak istiyorsaniz iki şeye dikkat etmelisiniz:
    // 1- Consturctor'larin ismi classismi ile ayni olmak zorundadir. Buyuk harfle baslamak zorundadir.
    // 2- Constructor'larin RETURN TYPE'i olmaz !!!!

    //ÖZETLE: constructor'in adi class adi ile ayni olmali ve return type'i olmamali

        public Araba(String renk){
        System.out.println(renk+" renkli bir araba üretidi");
            }
        public Araba(int yil){System.out.println(yil+" model bir araba üretildi");}
        public Araba(int yil,String renk){System.out.println(yil+" model "+renk+" renkli bir arba üretildi");}
}
