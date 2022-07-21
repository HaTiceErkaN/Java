package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {
        String str= "Bugun ne cok sey ogrendik";

        // bu cumlede bolsuk disindaki karakter sayisini bulunuz

        System.out.println(str.replace(" ", "").length());

        // atama yapilmadigi icin orjinal haliyle kalir

        System.out.println("orjinal str karakter sayisi:" +str.length());

        // bugun yerine yarin, ogrendik yerine ogrenecegiz

        str=str.replace("Bugun", "yarin");
        str=str.replace("ogrendik", "ogrenecegiz");

        System.out.println("kalici degisiklikten sonra: "+str);

    }
}
