package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {

        // verilen bir array'a yeni bir element ekleyen method oluştur

        int arr[]={3,5,7};
        int eklenecekElement=4;

        arr=arrayeElemanEkle(arr,eklenecekElement);
        arr=arrayeElemanEkle(arr,11) ;
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayeElemanEkle(int[] arr, int eklenecekElement) {
        int yeniArray[]=new int[arr.length+1];

        for (int i = 0; i <arr.length ; i++) {
            yeniArray[i]=arr[i];
        }
        yeniArray[yeniArray.length-1]=eklenecekElement;

        // yeniArray[arr.length]=eklenecekElement;  alternatif olarak bu da yazilabilir
        return yeniArray;
    }
}
