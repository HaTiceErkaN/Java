package day18_NestedForLoop;

public class C02_NestedForLoop {

    public static void main(String[] args) {

        // kullanicidan bir rakam alip carpim tablosu olusturalim

        int input= 3;

        // 1 2 3           1*1   1*2  1*3
        // 2 4 6           2*1   2*2  2*3
        // 3 6 9           3*1   3*2  3*3

        /*

        for (int i = 1; i <=input ; i++) {
            System.out.print(i+" ");
        }
        System.out.println(" ");  //buralardaki sout'lar alt satira gecebilmesi icin yazildi.
        for (int i = 1; i <=input ; i++) {
            System.out.print( 2*i+ " ");
        }
        System.out.println(" ");
        for (int i = 1; i <=input ; i++) {
            System.out.print(3*i +" ");
        }

         */
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");  // satiri asagiya gecirmek icin yazdik  (ln olmasi onemli)

        }



                




    }
}
