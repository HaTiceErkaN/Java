package day19_doWhileLoop;

public class C05_Scope {

    // 1- Bir method icerisinde olusturulan variable'lar sadece olusturulduklari
    //    method'da kullanilabilirler, baska method'larda kullanilamazlar
    // 2- Tum method'larin kullanabilmesini istedigimiz variable'lari
    //    Class level'da olustururuz
    //    Class level'da olusturdugumuz variable'i
    //    -- static yaporsak tum methodlar kullanabilir
    //    -- static olmazsa(instance) o zaman sadece static olmayan method'lar kullanabilir
    // 3- Loop icinde olusturulan variable'lar loop icerisinde kullanilabilir
    //    ama loop'un disinda kullanilamaz

    static String kurs="Java";
    int level=10;

    public static void main(String[] args) {
       // int sayi=10;
       // isim="Vali yan";
        System.out.println(kurs);
      //  System.out.println(level);
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            int loopsayi=20;

        }
       // System.out.println(i);
        // loopsayi=30;
        
    }

    public static void method1(){
      //  sayi=20;
      //  String isim= "Ali can";
      //  System.out.println(kurs);
    }

    public void method2(){
        // sayi=30;
        // isim="Ayse san";
        System.out.println(kurs);
        System.out.println(level);
    }
}
