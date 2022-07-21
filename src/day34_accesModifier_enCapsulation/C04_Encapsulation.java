package day34_accesModifier_enCapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {
        /* Bir variable'i encapsule etmek icin
            1- Access modifier'i private yapariz
            2- okuma ve yazma ozelliklerinin kullanilmasini istedigimiz gibi sinirlayabiliriz
                - Eger sadece okunmasini istiyorsaniz getter
                - Sadece deger girilebilsin isterseniz setter
               methodlarini olustururuz.
           Bir variable icin hem getter hem setter olusturursaniz
           o variable public olmus gibi hem okuyup hem de yazilmasini saglayabilirsiniz
         */

        C03 obj= new C03();
        obj.setStr("Java java java");
        System.out.println(obj.getStr());

    }
}
