package odevler;

public class C05_DataCstingSorulari {
    public static void main(String[] args) {

        // Soru 1 ) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde birer degisken
        // olusturup adim adim widening yapin ve yazdirin

        byte sayi1=118;
        short sayi2= sayi1;
        int sayi3= sayi2;
        float sayi4= sayi3;
        double sayi5=sayi4;

        System.out.println(sayi1);
        System.out.println( sayi2);
        System.out.println(sayi3);
        System.out.println( sayi4);
        System.out.println(sayi5);

        // 2) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin

        int sayi6=245876;
        short sayi7=  (short) sayi6;
        byte sayi8= (byte) sayi7;

        System.out.println(sayi6);
        System.out.println(sayi7);
        System.out.println(sayi8);



    }
}
