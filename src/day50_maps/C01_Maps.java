package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {

    public static void main(String[] args) {
            // siniftaki ogrenci listesini duzenli olarak yazdiralim
            Map<Integer,String> sinifListMap= MapOlustur.myMap();
            System.out.println(sinifListMap);
        /* Eger key'lere tek tek ulasmak istersek
           index yapisina ihtiyacimiz var
           ancak map index yapisini desteklemez
           bunun icin key'leri once bir set'e
           sonra da set'in tum elementlerini bir list'e ekledik
         */
             // KEYLERİ ATAMA:
             Set<Integer> sinifKeySeti=sinifListMap.keySet();
            List<Integer> keyList=new ArrayList<>();
            keyList.addAll(sinifKeySeti);

            //VALUELERİ ATAMA:
            Collection<String> sinifValueColl =sinifListMap.values();
            List<String> sinifValueList=new ArrayList<>();
            sinifValueList.addAll(sinifValueColl);
        System.out.println("sinifValueList: " +sinifValueList); //sinifValueList: [Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]
        System.out.println("0.index "+sinifValueList.get(0)); //0.index Ali, Can, Dev

        /* 2-)Sonrasinda olusturduğumuz listleri (value'ler içerisine 1'den fazla element
        bulundurduğu için( tek bir index'te 3 element var bunlari ayirmamiz gerekiyor
        => 0. index =Ali Can Dev)) MultiDimensionalArray'e ceviriyoruz.

        YAPMAK İSTEDİĞİMİZ ŞEY :
         String myArray[][]={{Ali, Can, Dev},{Veli, Yan, QA},{Ali, Yan, C#}
         */
            int outerArrayBoyut= sinifValueList.size();  //Burda outer Array'imizin length'ini belirledik
            String ilkValue=sinifValueList.get(0);
            System.out.println(ilkValue);
            String ilkValueArray[]=ilkValue.split(", "); //Burada elimizde olan ve tek bir index içerisinde bulunan
        // ilk value'yu split ederek indexlerine ayirdik.
        // ARTİK 0. index'tek değer =Ali, Can, Dev DEĞİL!!
        // 0.index= Ali, oldu, dolayisiyla ilk value'muzun length'i artik 1 değil 3 olacak

            int innerArrayBoyut=ilkValueArray.length;  //Burada 44. satirda oluşturduğumuz array'in length'ini kullandik
            String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];
            for (int i = 0; i <outerArrayBoyut ; i++) {
                String temp[]=sinifValueList.get(i).split(", ");
                for (int j = 0; j <innerArrayBoyut ; j++) {
                    valueMDArr[i][j]=temp[j];
                }
            }
            // bu satira kadar key'leri index ile ulasabildigim keyList' e atadim
            // value'leri valueMDArr'e atadim
            // simdi bu key ve value'leri istedigim gibi manuple edebilirim
            System.out.println("Numara  Isim   Soyisim  Brans");
            System.out.println("=============================");
            for (int i = 0; i <keyList.size() ; i++) {
                System.out.print( keyList.get(i)+ "   ");
                for (int j = 0; j < innerArrayBoyut; j++) {
                    System.out.print(valueMDArr[i][j] + "   ");
                }
                System.out.println("");
            }
        }
    }

