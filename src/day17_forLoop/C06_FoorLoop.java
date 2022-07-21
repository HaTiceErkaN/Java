package day17_forLoop;

public class C06_FoorLoop {
    public static void main(String[] args) {

        //Verilen 2 harf ve aralarindaki harfleri yazdiran birkod yaziniz

        // String harf1= "k";
        // String harf2= "v";

        //String ile yapamazsin cunku stringde harfler arasi gecis yoktur. char ile yapabilirsin cunku ascii kodlarini
        // kullanir

        char harf1= 'k';
        char harf2='v';



        for (char i = harf1 ; i <=harf2; i++) {
            System.out.print(i+" ");

        }

        double baslangic= 10;
        double bitis=20;
        double artis=0.2;

        //baslangicla bitis arasinda bu artisa gore tum sayileri yazdir

        for (double i = baslangic; i <=bitis ; i+=artis) {
            System.out.print(i+" ");

        }



    }
}
