package day23_multiDimensionalArrays;

public class C03_MDArrays {
    public static void main(String[] args) {

        // boyutlari belli bir array'i elementleri girmeden olusturalim.
        // bir okulun içinde 24 öğrenci olan 8 sinif vardir

        int arr[][]=new int[8][24];

        // 24 ogrencilik, 8siniflik, 5 okul var

        int ilce [][][]= new int[5][8][24];

        // bir okulda 3 tane 24 kisilik, 2 tane 22 kisilik sinif

        int sinif1[][]= new int [3][24];
        int sinif2[][]= new int [2][22];

        // direk tanimlama da yapabilirsin

        int sinif[][]={{3,1,7,5},{6,10}};




    }
}
