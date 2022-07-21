package day12_stringManipulation;

public class C02_LastIndexOf {
    public static void main(String[] args) {

        //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
        //kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //- Girilen kelime cumlede kullanilmamis.
        //- Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle= "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime= "yeni";

        int ilkKullanim= cumle.indexOf(kelime);
        int sonKullanim= cumle.lastIndexOf(kelime);

        if (ilkKullanim==(-1)){
            System.out.println("kullanilmamis");
        }else if (ilkKullanim==sonKullanim){
            System.out.println("1 defa kullanimis");
        }else{
            System.out.println("birden cok kere kullanilmis");
        }

        String str="Eclipse";
        System.out.println(str.lastIndexOf("p", 4)); //4 dahilmis


    }
}
