package day30_passByValue;

public class C02_StaticBlocks {
    {
        System.out.println("Static olmayan blok calisti");
    }
    static {
        System.out.println("static olmayan blok calisti");
    }

    public static void main(String[] args) {
        System.out.println("main mehod basi");

        C02_StaticBlocks obj1=new C02_StaticBlocks();
       C02_StaticBlocks obj2=new C02_StaticBlocks();
    }
}

