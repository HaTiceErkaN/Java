package day10_switch_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {

        // String herhangi bir karakteri almak istedigimizde o harfin index'ini kullanarak
        // str.charAt(istenenIndex) yazabiliriz

        String str="Java Cok Guzel";
        // J yi yazdiralim

        System.out.println(str.charAt(0));

        // eger G yi yazdirmak istiyorsan

        System.out.println(str.charAt(9));

        // va yazdiralim

        System.out.println(""+str.charAt(2)+str.charAt(3));

        // cOK yazdiralim

        System.out.println(""+str.toLowerCase().charAt(5)+str.toUpperCase().charAt(6)+str.toUpperCase().charAt(7));

        // son harfi yazdir  (Stringde 14 harf var dolayisiyla index sifirdan basladigi icin son harfin indexi 14-1'dir

        System.out.println(str.charAt(14-1)); //uzunluk-1 bizim icin onemli

        // eger uzunlugu index olarak girersek

        //System.out.println(str.charAt(14)); // java hata verir


    }
}
