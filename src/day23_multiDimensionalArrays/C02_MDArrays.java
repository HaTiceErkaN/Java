package day23_multiDimensionalArrays;

public class C02_MDArrays {
    public static void main(String[] args) {

        // Multi dimensional Array'in tüm elementlerinin toplamini bulunuz


        int arr [][]={{3,1,7,5},{6,10}};

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam+=arr[i][j];

            }
        } System.out.println(toplam);

        //  for (int i = 0; i <arr.length ; i++)  burda length 2, çünkü outer arr 2 length'e sahip, burda
        // i=0 <2 (length 2 oldugu için) body çalişacak alt koda geçecek
        //  for (int j = 0; j <arr[i].length ; j++)  burda j=0, ilk array'i verecek, onun da length'i 4,
        // dolayisiyla 0<<arr[i].length, ve ilk indexi alacak, sonra sirasiyla 0. array'in yani ilk array'in length'i
        // üzerinden işlem yapacak.

    }
}
