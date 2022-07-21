package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {

    public static void main(String[] args) {

        int arr [][]={{3,1,7},{6,10,2}};
        System.out.println((arr[0][2]));  //7
        System.out.println((arr[1][1]));  // 10

        // ilk inner array'in tüm elementlerini yazdir

        System.out.println(arr[0]);  // arr[0] bir array olduğundan direk yazidrilamaz  //[I@5b464ce8
        System.out.println(Arrays.toString(arr[0])); //[3,1,7]

        //MD Array'da tüm elementleri bir Array olarak yazmak istersek

        Arrays.deepToString(arr);
        System.out.println( Arrays.deepToString(arr));



    }
}
