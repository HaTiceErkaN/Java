package day05_matematikselislemler;

public class C01_PreIncrementPostIncrement {

    public static void main(String[] args) {
        int sayi=10;
        sayi++;
        System.out.println(sayi);

        sayi++;
        System.out.println("pre-incrementten once"+sayi);

        // eger 11. ve 12. satırda yaptıgım iki islemi tek satırda yaparsam java iki islemden önce hangisini yapacagini
        // bilmek ister.
        // once artirir sonra yazdirirsak java yeni degeri yazdirir. ama once yazdirir sonra artirirsak java eski degeri
        // yazdirir.


        System.out.println("pre-increment satirinda"+ ++sayi);  //once artir sonra yazdir
        System.out.println("pre-incrementten sonra" +sayi);

        System.out.println("post-increment satirinda"+ ++sayi);
        System.out.println("post increment satirindan sonra"+ sayi);



    }
}
