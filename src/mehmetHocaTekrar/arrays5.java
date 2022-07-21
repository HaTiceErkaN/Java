package mehmetHocaTekrar;

import java.util.Arrays;

public class arrays5 {
    public static void main(String[] args) {


        //Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir
        //Array olarak yazdiran bir method yaziniz

        int arr[] = {3, 1, 7, 6, 10, 2};
        int istenen = 7;

        istenmeyenDegeriKaldir(arr, istenen);


    }

    private static void istenmeyenDegeriKaldir(int[] arr, int istenen) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <arr.length ; i++) {
          if (i== istenen){
              System.out.println(istenen);
            }

        }

    }
}