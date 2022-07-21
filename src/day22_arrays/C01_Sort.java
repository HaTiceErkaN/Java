package day22_arrays;

import java.util.Arrays;

public class C01_Sort {

    public static void main(String[] args) {

        String arr[]={"S","M","A","T"};

        System.out.println(Arrays.toString(arr));   // smat
        Arrays.sort(arr);   // siralama yapiyor
        System.out.println(Arrays.toString(arr));  //amst

        // Javada bu siralamaya kucukten buyuge ya da buyukten kucuge siralama yapar.
        // java da bu siralamaya Natural order denir,
        // Sayş olursa kucukten buyuge, metin olursa alfabetik siraya gore;



    }
}
