package day04_dataCasting_Increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {

        int sayi=20;
        System.out.println(sayi+10);

        // bu satırda sayıyı 10 artırmadım, sayının 10 fazlasını yazdırdım

        System.out.println(sayi);
         // eger atama yapmazsak sayıda yaptıgmız artırma veya azaltma kalıcı olmaz. kaydedilmez. kaydedilmesini
        // istiyorsan atama yap

        sayi=sayi+10;
        System.out.println(sayi);

        System.out.println(sayi=sayi+10);

        System.out.println(sayi);

        System.out.println(sayi+=10);

        // bir variable ın degerini kalıcı olarak artırmak veya azaltmak isterseniz assignment sart
        // NORMAL ATAMA İLE SOUT İÇİNDEKİ ATAMA ARASINDA FARK YOK

        System.out.println(sayi++); // bunu 51 yazdırmadı alttakii 51 yazdırdı
        System.out.println(sayi);






    }
}
