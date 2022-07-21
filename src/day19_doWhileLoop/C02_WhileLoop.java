package day19_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve
        // bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin

        int input=12345678;
        int rakam=0;
        int rakamlarToplami=0;

        while (input>0){
            rakam=input%10;
            rakamlarToplami+=rakam;
            input/=10;
            System.out.println("rakam: "+rakam +" ve rakamlar toplami: "+rakamlarToplami);
        }
        System.out.println("Rakamlar toplami: "+rakamlarToplami);



    }
}
