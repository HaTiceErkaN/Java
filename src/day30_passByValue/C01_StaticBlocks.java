package day30_passByValue;

public class C01_StaticBlocks {
    static {
        System.out.println("static block2 calisti");//1. BU KOD ÇALİŞİR
    }
    static{
        /*
        static block class ilk calismaya basladiginda devreye girer
        ve class'in calismasi icin gerekli on hazirliklar icin kullanilir
        yazildigi satirin hic bir onemi yoktur, class icerisinde istenen yerde yazilabilir
        static block birden fazla olursa, bloklar yukaridan asagi dogru sirayla calisir
         */
        System.out.println("static block1 calisti");  //2. BU KOD ÇALİŞİR
    }
    C01_StaticBlocks(){
        System.out.println("Constructor calisti");   //4. BU KOD ÇALİŞİR
    }
    public static void main(String[] args) {          //3. BU KOD ÇALİŞİR
        System.out.println("main method baslangici");
        C01_StaticBlocks obj1;
        new C01_StaticBlocks();
        System.out.println("main method sonu");         //5. BU KOD ÇALİŞİR
    }

}

