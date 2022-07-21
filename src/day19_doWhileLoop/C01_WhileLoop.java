package day19_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve
        // bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin

        int input=20;

        /*
        int bolen=1;
        for (int i = 1; i <=20 ; i++) {
            if (input%bolen==0){
                System.out.print(bolen+ " ");
            }
            bolen++;
        }

         */


        int bolen=1;
        int sayac=0;

        while (bolen<=input){
            if (input%bolen==0){
                System.out.print(bolen +" ");
                sayac++;
            }
            bolen++;  // boleni artirmazsan sonsuz donguye girer. cunku her seferinde 20%1=0 olacagi icin hep 1 yazdirir
        }
        System.out.println(" ");
        System.out.println(input + "sayisini bolen "+ sayac+ "adet sayi vardir");


    }
}
