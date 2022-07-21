package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1=879;
        double sayi2= 10;
        double sayi3= sayi1/sayi2; // java bunu geniş olana cevirecek double yapacak

        System.out.println(sayi3);

        //int sayi4= sayi1/sayi2;  //deger double, variable int, yani variable daha dar. dolayısıyla java bunu yapmaz.
                                 // cünkü 87,9 double birsayıdır ve int. olmaz data kaybı olur. o yüzden java yapmaz.
                                 // illa yapmak istersek:

        int sayi4= (int) (sayi1/sayi2);  // sağ tarafa yazılan (int) sorumluluk bende demek. java bunu dönüştürür.

        System.out.println(sayi4);

        int sayi5=140;
        byte sayi6= (byte) sayi5;    // sağdaki değer int> sol taraftaki değer byte

        System.out.println(sayi6);

        sayi5=129;                          //-127
        sayi6= (byte) sayi5;
        System.out.println(sayi6);

        sayi5=260;                         //4
        sayi6= (byte) sayi5;
        System.out.println(sayi6);

        sayi5=520;                           //8
        sayi6= (byte) sayi5;
        System.out.println(sayi6);

        sayi5=-130;                          //126
        sayi6= (byte) sayi5;
        System.out.println(sayi6);

        //EŞİTLİĞİN SAĞ TARAFINI SOL TARAFINA ÇEVİRİYORUZ!!!





    }
}
