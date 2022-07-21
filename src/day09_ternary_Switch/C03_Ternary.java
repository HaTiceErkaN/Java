package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayi=20;
        // verilen sayinin 2 veya daha cok basamakli olup olmadigini kontrol eden ve sonucu yazdiran bir ternary yap

        String sonuc =sayi>=100 ? "sayi3 basamakli veya daha buyuk" : "sayi 3 basamaktan kucuk veya negatif";
        System.out.println(sonuc);

        // Turnery bize sonuc dondurdugu icin ya bu sonucu direk yazdiririz
        // ya da sonucun turune uygun bir variable'a atama yapabiliriz
    }
}
