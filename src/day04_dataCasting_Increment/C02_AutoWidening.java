package day04_dataCasting_Increment;

public class C02_AutoWidening {
    public static void main(String[] args) {
        boolean dogruMu= true;
       // String sr= dogruMu;  // sol string sağ boolean olunca kabul etmiyor

        byte sayi1=  44;

        System.out.println(sayi1);

        short sayi2= sayi1;  //eşitliğin solu short, sağı ise byte (burda itiraz etmiyor. ama yukarda etmişti)

        //deger olarak atanan data türü variable data türünden kucuk oldugu icin java sorun yapmaz.== AUTO WİDENİNG

        System.out.println(sayi2);

        double sayi3= sayi1;

        System.out.println(sayi3);



    }
}
