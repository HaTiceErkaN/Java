package odev_variables;

public class Odev_1 {

    public static void main(String[] args) {

        // 1)Farkli 3 data turunde variable olusturun ve bunlari yazdirin

        String EvcilHayvaninizinAdi= "Meric";
        boolean adıMericMi= true;
        char ilkHarf='M';
        byte yasi= 3;
        short koyNufusu= 27348;
        int turkiyeNufusu=24568521;
        float kucukOndalklıSayı=0.2584f;
        double buyukOndalikliSayi=15478.4589;

        System.out.println(EvcilHayvaninizinAdi);
        System.out.println(adıMericMi);
        System.out.println(ilkHarf);
        System.out.println(yasi);
        System.out.println(koyNufusu);
        System.out.println(kucukOndalklıSayı);
        System.out.println(buyukOndalikliSayi);

        // 2)isim ve soyisim icin iki variable olusturun ve isminiz : Mehmet  soyisminiz : Bulutluoz seklinde yazdirin

        String isim="Hatice";
        String soyIsminiz="ERKAN";

        System.out.println("isminiz:"+ isim);
        System.out.println("soyIsminiz:"+soyIsminiz);

        // 3)Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin

        int sayi1=145;
        short sayi2=157;
        System.out.println("sayi1+sayi2:"+ (sayi1+sayi2));

        //4) Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin

        int sayi3= 28;
        float sayi4= 2.18f;

        System.out.println(sayi3+sayi4);

        // 5) char data turunde bir variable olusturun ve yazdirin

        char enSevdiginHarf= 'Y';
        System.out.println(enSevdiginHarf);

        // 6) Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        int sayi5= 28;
        char sayi6='5';

        System.out.println(sayi5+sayi6);  // ascii tablosundaki kücük 5'in karsiligi olan sayiyi yazdirir.

        // Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
        //Orn : sayi1=10 ve sayi2=20; kod calistiktan sonra sayi1=20 ve sayi2=10

        int sayi8= 10;
        int sayi9= 15;

        System.out.println("Swap'dan once sayi8:"+ sayi8 +"sayi9:"+sayi9);

        sayi8= sayi8+sayi9;
        sayi9= sayi8-sayi9;
        System.out.println("Sayi9 yenideger:"+ sayi9);
        sayi8= sayi8-sayi9;
        System.out.println("Sayi8 yenideger:"+ sayi8);
        System.out.println("Swap'dan sonra sayi8:"+sayi8 +"sayi9:"+sayi9);

    }
}
