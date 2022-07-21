package odevler;

public class C02_InterviewQuestion {
    public static void main(String[] args) {

        /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
        Orn : sayi1=10 ve sayi2=20;
        kod calistiktan sonra
        sayi1=20 ve sayi2=10

         */

        int sayi1=10;
        int sayi2=20;
        System.out.println("Swapten once sayi1 :"+sayi1+" sayi2 :"+sayi2);
        int temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;
        System.out.println("Swapten sonra sayi1 :"+sayi1+" sayi2 :"+sayi2);

        // 2- Verilen sayi1 ve sayi2 variable’larinin degerlerini 3.bir variable olmadan degistiren (SWAP)
        // bir program yapiniz

        int sayi3=15;
        int sayi4= 20;

        System.out.println("Swapten once sayi3 :"+sayi3+" sayi4 :"+sayi4);

        sayi3=sayi3+sayi4;
        sayi4= sayi3-sayi4;
        sayi3=sayi3-sayi4;
        System.out.println("Swapten sonra sayi3 :"+sayi3+" sayi4 :"+sayi4);

    }
}
