package day34_accesModifier_enCapsulation;

public class C03 {
    // encapsule edecegimiz 2 variable olusturalim
    private int sayi;
    private String str;

    public int getSayi() { //Okunsun ama yazilamasin, değiştirilemesin
        return sayi;
    }

    public void setSayi(int sayi) {  //Değer girebilir ama raporu göremez
        this.sayi = sayi;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
