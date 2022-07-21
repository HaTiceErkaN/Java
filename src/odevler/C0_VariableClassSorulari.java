package odevler;

public class C0_VariableClassSorulari {
    public static void main(String[] args) {
        // 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
        char ilkHarf = 'Y';
        boolean ilkHarYMi = true;
        int sayi = 25;

        System.out.println(ilkHarf);
        System.out.println(ilkHarYMi);
        System.out.println(sayi);

        /*
        2- isim ve soyisim icin iki variable olusturun ve bunlari
            isminiz : Mehmet
            soyisminiz : Bulutluoz
            seklinde yazdirin
         */

        String isim= "Yigit";
        String soyIsim= "Gunduzalp";
        System.out.println("Isminiz: "+ isim);
        System.out.println("soyIsminiz: "+ soyIsim);

        // 3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin

        int sayi1=24;
        int sayi2=18;
        System.out.println(sayi1+sayi2);

        // 4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
        int sayi3=12;
        double sayi4=22.8;
        System.out.println(sayi3+sayi4);

        //5- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        int sayi5= 65;
        char sembol='#';
        System.out.println(sayi5+sembol);

    }
}
