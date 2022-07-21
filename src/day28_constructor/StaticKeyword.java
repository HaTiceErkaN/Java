package day28_constructor;

public class StaticKeyword {
    static int sayi1;
    int sayi2;  // static olmayan, instance variable

    public static void main(String[] args) {

        // Static variable class'a bağli, değer atamasi yapilmayinca default atama yapar.
        // Statik olmayanlar objeye bağli olduğu için sadece oluşturulan obj'ye yapilan değer geçerlidir.
        // obj1.sayi2=8;
        //obj2.sayi2;   //burda obj2 olduğu için ve yeni bir obje (değer atanmamiş olduğu için) default değer atar.

        System.out.println("sayi1: "+sayi1);  // 0 yazdiracak
        // System.out.println("sayi2: "+sayi2);  // static olmadiği için main method'dan direk kulanamyiz
        StaticKeyword obj1=new StaticKeyword();
        System.out.println("sayi2 :" +obj1.sayi2);   //0 yazdiracak

        sayi1++;
        obj1.sayi2++;
        System.out.println("sayi1: "+sayi1);
        System.out.println("sayi2 :" +obj1.sayi2);

        StaticKeyword obj2= new StaticKeyword();
        System.out.println("sayi2: "+obj2.sayi2); //0  (bu instance olduğundan obje üzerinden vardir dolayisiyla obj2 de
                                                 // ilk defa olusturulduğu ve atama yapilmadiğiiçin default değer atar
        System.out.println("sayi1: "+obj2.sayi1); //1  (bu static olduğu için direk en son değeri yazdirir

        obj2.sayi1++;       //2
        obj2.sayi2++;       //1

        System.out.println("sayi 1: "+obj2.sayi1);
        System.out.println("sayi 2: "+obj2.sayi2);

        System.out.println("sayi 1: "+obj1.sayi1);
        System.out.println("sayi 2: "+obj1.sayi2);

        obj1.sayi1++;
        obj1.sayi2++;

        System.out.println("sayi1: "+obj1.sayi1);
        System.out.println("sayi2: "+obj1.sayi2);

    }
}
