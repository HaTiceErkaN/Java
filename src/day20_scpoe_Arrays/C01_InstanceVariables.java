package day20_scpoe_Arrays;

public class C01_InstanceVariables {

    int sayi;
    String bransIsmi= "Java";
    boolean okulAcikMi;



    public static void main(String[] args) {
       // sayi=10;   sayi variable'i static olmadigi icin main method'dan direk kullanilamaz
        // instance variable'lara static variable'lardan ulasabilmek icin obje olusturmamiz gerekir

        C01_InstanceVariables obj1=new C01_InstanceVariables();
        System.out.println(obj1.sayi);  //0 yazdirir
        obj1.sayi=10;
        System.out.println(obj1.sayi);
        // sayi=10; yapmiyor
        // ikisi arasindaki fark şu obj1 dediğimiz öğrenci gibi. birinin branşini değiştiriyorsan sadece onu
        // değiştirisin diğerlerini bağlamaz.
        obj1.bransIsmi="SQL";
        System.out.println(obj1.okulAcikMi);


        C01_InstanceVariables obj2=new C01_InstanceVariables();
        System.out.println(obj2.sayi); //0 yazdirir. yukarda obj1'i değiştirdik. ama bu başka obje o yüzden 0
        System.out.println(obj2.bransIsmi);  // yukarda obj1 icin bransIsmi atamasi yaptik ama o ona özel. burdaki
        // brans obj2'nin oldugu icin üstte main methoddan önce atanan java'yi yazdirir

        obj1.okulAcikMi=true;
        System.out.println(obj2.okulAcikMi);



    }
}
