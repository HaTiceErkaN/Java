package day25_lists;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {

        // verilen bir Array'den istenen elementi silip, kalanlari yeni bir array olarak yazdiran bir method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=7;

        istenmeyenElementiSil(arr,istenmeyenEleman);
    }

    //1. adim istenmeyen elementi sayacak(kaç tane var) cunkü silinecek eleman sayisini bulmadan yeni array'in boyunu
    // bulamaz
    // 2. adim yeni array olustur
    //3. adim eski array'den uygun elementleri yeniye taşi
    // 4. adim bunu yazdir.



    public static void istenmeyenElementiSil(int[] arr, int istenmeyenEleman) {
        //1.ADİM Eleman sayisini bulmak

        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==istenmeyenEleman){
                sayac++;
            }
        }

        // 2.ADİM Yeni array olusturalim
        int arrYeni[]=new int[arr.length-sayac];

        // 3.ADİM Eski arry'den uygun elementleri yeniye tasi
        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=istenmeyenEleman){
                arrYeni[index]=arr[i];
                index++;

            }
        }

        //4.ADİM yazdir
        System.out.println(Arrays.toString(arrYeni));
    }
}
