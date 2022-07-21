package day22_arrays;

public class C05_BinarySearch {

    public static void main(String[] args) {

        // verilen array'de istenen bir elementin varliğini true/false ile döndür.

        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=5;

        istenenElemanVarMi(arr,istenenSayi);
    }

    private static void istenenElemanVarMi(int[] arr, int istenenSayi) {
        boolean sonuc=false;  // temp atatik.

        for (int i = 0; i <arr.length ; i++) {
            if (istenenSayi==arr[i]){
                sonuc=true;
                break;
            }/*else{
                System.out.println("false");  // buraya bunu yaparsak önce 3'ü 5 ile karşilaştirir olmazsa false yazar
                sonra 5'i karşilaştirir true yazar. sonra 6'yi karşilaştirir false yazar. dolayisiyle if'ten sonra break
                olacak ama else olmayacak
            }
            */
        }
        System.out.println(sonuc);
    }
}
