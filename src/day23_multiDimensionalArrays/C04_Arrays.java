package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {

        // kullaniciya kaç elementlik bir Array oluşturacağini sorun, Array'i oluşturup elementleri kullanicidan alip,
        // Array'a atayin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kaç elementlik array istediğinizi yaziniz");

        int uzunluk=scan.nextInt();

        int arr []=new int[uzunluk];  // {0,0,0,0,0}

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Array icin " +(i+1)+ ". eleman giriniz");
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
