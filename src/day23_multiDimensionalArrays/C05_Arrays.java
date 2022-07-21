package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

        // Verilen bir Array'e yeni bir element ekleyen bir method yaziniz

        int arr[]={3,5,7};
         // varolan bir array'a ayni boyutta olsabile direk yeni değerler içeren bie array atayamayiz

        arr=new int[4];
        System.out.println(Arrays.toString(arr));

        int arrYeni []= new int[5];
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));

        arrYeni [0]=2;
        arrYeni [3]=5;
        System.out.println(Arrays.toString(arr));





    }
}
