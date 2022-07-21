package day27_constructor;

public class Cons01 {
    Cons01(String par1 ){
        System.out.println("Parametreli");
    }

    Cons01(){
        // Buraya hic public falan yazmadik. dolayisiya java access modifier'i default kabul etti
        // Public, Private, Default, Protected (4 adet acces modifier var
        System.out.println("Parametresiz");

    }
}
