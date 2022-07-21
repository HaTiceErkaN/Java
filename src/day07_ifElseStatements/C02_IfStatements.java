package day07_ifElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        if (a>b && b<100){

            System.out.println("isleminiz gerceklesecek");
            System.out.println("body icndeki tum kodlar calisir");
        }
        if (a<0) System.out.println("suslu parantez olmazsa sadece 1 satir calisir");

        //bir if cumlesinin daha anlasilir olmasini istiyorsaniz if body'sini süslü parantez
        // icine yazmalisiniz. body süslü parantez icine yazmazsak da if cumlesi calisir. ancak ilk
        //; gordugunde if cumlesi bitmis olur

        //21 satirdaki kod 13. satirdaki if dogru olsa da calisir false olsa da

        System.out.println("ikinci satir da calisti");

        // Kullanicidan bir tamsayiisteyin ve sayinin tek veya cift oldugunu yazdirin



    }
}
