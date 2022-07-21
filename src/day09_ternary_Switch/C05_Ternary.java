package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {

        // Bazen ternary'deki iki sonucun data turleri farkliolabilir

        // verilen sayi 100'den buyukse sayinin karesini alip yazdiran
        // 100'den kucukse "sayi 100'den buyuk olmali é yazdiran bir ternary olusturalim

        int sayi=200;

        // ternary bize sonuc getirdiginden ya sonucu direk yazdirmaliyiz veya bir degiskene atamaliyiz
        // eger sonuclar farkli data turunde ise atama yapacagimiz variable'in data turu tek olacagindan atama yapamayiz
        //SADECE direk yazidrabiliriz

        System.out.println(sayi>100 ? sayi*sayi : "sayi 100'den buyuk olmali");


    }
}
