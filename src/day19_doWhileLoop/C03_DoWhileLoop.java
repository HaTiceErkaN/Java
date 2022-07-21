package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        // kullanicidan pozitif bir sayi alip while loop ile sayidan  kucuk pozitif tam sayilari sayilari yazdiralim
        int input=1;

        int sayi=1;
        int sayac=0;

       while (sayi<input){
            System.out.println(sayi);
            sayac++;
            sayi++;
        }

        // Ayni soruyu do-while loop ile yapalim

        sayi=1;
        do {
            System.out.println(sayi);
            sayi++;
        }while (sayi<input);


    }
}
