package odev_variables;

public class Odev_DataCasting {
    public static void main(String[] args) {
        // 1) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde birer degisken
        // olusturup adim adim widening yapin ve yazdirin

        byte sayi1= 125;
        short sayi2= sayi1;
        int sayi3= sayi2;
        float sayi4= sayi3;
        double sayi5= sayi4;

        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(sayi3);
        System.out.println(sayi4);
        System.out.println(sayi5);

        // 2) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin

       // int myInt =25;
        //short myShort=(short)myInt;
        //byte myByte= (byte) myShort;


       // System.out.println(myInt);
        //System.out.println(myShort);
        //System.out.println(myByte);


        // 3) double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip yazdirin

        double myDouble= 255.36;
        int myInt = (int) myDouble;
        byte myByte= (byte) myInt;

        System.out.println(myDouble);
        System.out.println(myInt);
        System.out.println(myByte);

        // 4) int 2 sayiyi birbirine boldurun ve sonucu yazdirin

        int sayi8 =20;
        int sayi9=8;
        System.out.println(sayi8/sayi9);

        //int bir sayiyi double bir sayiya bolun ve sonucu yazdirin

        int sayi10=25;
        double sayi11=2.8;
        System.out.println(sayi10/sayi11);
















    }
}
