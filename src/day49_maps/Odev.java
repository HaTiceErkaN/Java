package day49_maps;

import java.util.*;

public class Odev  {
    public static void main(String[] args) {
        Map<Integer, String> sinif=MapOlustur.myMap();
        sinif.put(101,"Ali, Can, Dev");
        sinif.put(102,"Veli, Yan, QA");
        sinif.put(103,"Ali, Yan, C#");
        sinif.put(104,"Mehmet, Ozgur, QA");
        sinif.put(105,"Yigit, Gunduzalp, C#");
        listeyiDuzgunYazdir(sinif);
    }

    private static void listeyiDuzgunYazdir(Map<Integer, String> sinif) {
        Set<Integer> keySet = sinif.keySet();
        Collection<String> valueSet = sinif.values();
        System.out.println("Numara     Isim        Soyisim    Brans");
        System.out.println("=======================================");
        for (Integer each : keySet) {
            String values = sinif.get(each);
            String[] valuesArray = values.split(",");
            int index = 0;
            while (index < valuesArray.length - 1)
                System.out.printf("%-10d %-10s %-10s %-10s\n", each, valuesArray[index], valuesArray[++index], valuesArray[++index]);


            // System.out.println("Numara  Isim   Soyisim  Brans");
            //  System.out.println("=============================");
            //  System.out.printf("%d %-10s \n", keySet., valueSet  );
        }

    }
}
