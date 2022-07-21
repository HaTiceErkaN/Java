package day11_stringManipulation;

import java.util.Scanner;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {

        //Kullaniciya derse katilip katilmak istemedigini sorun evet derse cevabini ve "katiliminiz alinmistir"
        // hayir derse cevabini ve "sonraki derslerimize bekleriz" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Derse katilmak ister misiniz?\n Evet veya Hayir yaziniz");
        String cevap= scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz :" + cevap + " derse katiliminiz onaylanmistir");
        }else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz:"+ cevap +" sonraki derslerimize bekleriz");
        }else {
            System.out.println("Lutfen evet veya hayir yaziniz");
        }
    }
}
