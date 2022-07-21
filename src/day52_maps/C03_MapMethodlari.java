package day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMethodlari {

    public static void main(String[] args) {
        Map<String,Integer> myMap=new HashMap<>();

        myMap.put("H",3);  //Put direk koyar, orada bir değer var mi yok mu bakmaz
        myMap.putIfAbsent("K",5);  //IfAbsent ise kontrol eder varsa dokunmayalim der.

        //Bir ekleme yapmak istediğimizde, key daha önce eklenmemişse map'e eklesin, daha önceden eklenmişse eskiyi
        // silmemek için bizi uyarsin.

        System.out.println(myMap.putIfAbsent("A", 6));  // "A" yoktu, ekledi ve null döndürdü,
        System.out.println(myMap.putIfAbsent("K", 20)); //"K" vardi, eski değeri olan 5'i getirdi
        System.out.println(myMap); //{A=6, H=3, K=5}  //A'yi eklemiş, K'yi eklememiş (Değiştirmemiş)

        if (myMap.putIfAbsent("K", 20)!=null){
            System.out.println("Girdiğiniz key map'de zaten var");
        }
        System.out.println(myMap);

        myMap.put("A",10);
        System.out.println(myMap);
        myMap.computeIfAbsent("A", v -> 20);
        System.out.println(myMap);
        myMap.compute("A" , (key,value) -> 20);
        System.out.println(myMap);
        // H'nin degerini 2 katinin 5 fazlasi yapalim
        myMap.compute("H", (m,n) ->(2*n+5));
        System.out.println(myMap);

    }

}
