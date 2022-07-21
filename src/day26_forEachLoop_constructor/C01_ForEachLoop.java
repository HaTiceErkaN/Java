package day26_forEachLoop_constructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        //SONDAN BAŞA YAZDİRMAZ

        int arr[]={2,4,6,8,11};

        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

        // index başlangiç değeri gibi şeylere gerek kalmadan collections'tan tüm elementleri bize getirir.
        // Bunu for-each loop ile yapmak için hedef bir collection vermeliyiz
        for (int each: arr
             ) {
            System.out.print(each+" ");
        }
        // DEZAVANTAJİ: index'e bağli bir islem yapamayiz ( ilk 3 elementi yazdir falan diyemeyiz)
    }
}
