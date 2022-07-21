package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        //iki string array olusturunuz ve bu array'lerdeki ortak eleanlari For-each loop kullanarak bulunuz.
        // sonucu ekrana yazdiriniz.
        //ortak eleman yoksa "Ortak eleman yok" yazdiriniz

        String array1[]={"Ali", "Ayse", "Can","Fatma"};
        String  array2[]={"Can","Evren","Emsal","Fatma","Emre","Ali", "Ali"};

        List<String> ortakElemanlar= new ArrayList<>();

        for (String each1:array1
             ) {
            for (String each2:array2
                 ) {
                if (each1.equals(each2)){
                    ortakElemanlar.add(each1);
                }
            }
        }

if (ortakElemanlar.isEmpty()){
    System.out.println("Ortak eleman yoktur");
}else {
    System.out.println("İki Array'deki ortak elemanlar: "+ortakElemanlar);
}
    }
}
