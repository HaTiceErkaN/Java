package mehmetHocaTekrar;

import java.util.Scanner;

public class arrays4 {
    public static void main(String[] args) {

        //Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();

      String kelimesayisiArr []= cumle.split(" ");
      ;


        System.out.println(kelimesayisiArr.length);


    }
}
