package day52_maps;

import day49_maps.MapOlustur;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Numarasi102OlaniDegistir {
    //VERİLEN MAP'DEKİ KEY'İ 102 OLAN BRANS'LARİ JAVA YAPALİM.

    public static void main(String[] args) {
        Map<Integer,String > yeniMap= MapOlustur.myMap();

         Set<Map.Entry<Integer,String>> sinifEntrySet =yeniMap.entrySet();

        for (Map.Entry<Integer,String> each:sinifEntrySet
             ) {
            Integer keyEntry= each.getKey();
            String valueEntry= each.getValue();
           if (keyEntry==102){
               String valueArr[]=valueEntry.split(", ");
               valueArr[2]="Java";
               String valueYeni=valueArr[0]+", "+valueArr[1]+", "+valueArr[2]+", "+valueArr[3];

               yeniMap.put(keyEntry,valueYeni);
           }
        }
        System.out.println(yeniMap);
    }
}
