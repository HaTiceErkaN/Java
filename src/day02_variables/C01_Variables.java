package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {
        // bir variable olustururken icerisine koyacagim datanin alabilecegi degerlere uygun
        // bir data turu saecmeliyiz
        // ornegin bir sehrin nufusundan bahsediyorsak
        // variable'imizin data turu String, boolean, char veya double olamaz
        // geriye kalan tamsayi turlerinden sehrin nufusunu icine alabilecek buyuklukte bir data turu seceiliriz
        // biz kurs boyunca genelde tam sayilar icin int, ondalikli sayilar icin double kullanacagiz

        int level = 1;
        System.out.println(level);
        boolean ogrenciMi= true;

        boolean yagisVarMı= false;
        System.out.println(ogrenciMi);
        System.out.println(yagisVarMı);
    }
}