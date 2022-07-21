package day20_scpoe_Arrays;

public class C02_StaticVariables {

    /* instance variable'lar objeye bagimlidir ve her obje farkli degerler alabilir.
    buna örnek olarak öğrenci notlari veya öğetmen branşlari gini bir objeye ait bir variable'in son degerini bulmak
    icin  sadece o objeyi dikkate aliriz.

    Static variable'lar ise class variable olarak tanimlanir ve tüm class uyeleri icin aynidir. eger static variable'in
    degeri değiştirilirse herkesiçin değişir.

     */
   static String okulIsmi="Yildiz Koleji";
   static  int okulNo;
   static boolean okulAcikMi;



    public static void main(String[] args) {

        System.out.println(okulIsmi);
        System.out.println(okulNo);
        okulNo=102;
        System.out.println(okulNo);
        System.out.println(okulAcikMi);

        staticMethod(); // burasi bizi 22. satira götürür

        System.out.println(okulNo);

    }

    public static void staticMethod(){

        okulNo=200;
        System.out.println(okulNo);
    }
}
