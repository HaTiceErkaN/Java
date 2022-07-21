package day29_staticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {

        // baska class'taki static class uyelerine ulasabilmek icin sadece classIsmi.staticUyeIsmi
        // yazmamiz yeterlidir.

        System.out.println(C01_Static.okulTelefonu);

        C01_Static.okulTelefonu="3125474747";
        System.out.println(C01_Static.okulTelefonu);  //3125474747
    }
}
