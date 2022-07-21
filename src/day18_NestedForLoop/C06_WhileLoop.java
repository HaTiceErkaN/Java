package day18_NestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan iki tamsayi alip
        // bu sayilari ve aralarindaki tum tamsayilari yazdiran bir kod olusturun
        
        int baslangic=12;
        int bitis=18;

        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i+" ");
        }
        System.out.println(" ");

        // Ayni soruyu while loop ile yapalim
        int i=baslangic;

        while (i<=bitis){
            System.out.print(i+ " ");
            i++;
        }
        System.out.println(" ");
        System.out.print(baslangic);  //++ dedigimiz icin baslangic'i 1 artirdi

    }
}
