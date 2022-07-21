package day27_constructor;

public class Cons02 {
    public static void main(String[] args) {
        Cons01 obj1=new Cons01();    // Constructor kullanarak bir obje oluşturduk
        // Defoult constructor devrede

        // Biz kendimiz olusturdugumuzda DEFAULT CONSTRUCTOR DEVRE DIŞI KALİYOR.

        /*
         Cons01 classinda Hic constructor olusturmazsak java default constructor u kullandiğindan obj1'i üretebiliriz
         Ancak biz parametreli veya parametresiz bir constructor yazdigimizda Java artik devreden çikar
         Dolayisiyla biz herhangi bir costructor olusturduğumuzda daha önce baska classla veya kullanicilarin olusturmus
         olabilecegi objeleri kullanabilmeleri icin default constructor'in islevini gerceklestirebilecek parametresiz bir
         consturctor olusturmakta fayda var.
         */

        Cons01 obj2=new Cons01("Java");


    }

}
