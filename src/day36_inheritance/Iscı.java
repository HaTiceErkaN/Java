package day36_inheritance;

public class Iscı extends Memur {

    protected String isciStatu ="Surekli Isci";  //Bunu tanimladik çünkü bizözel olarak ustabaşi vs diye belirtmezsek
    //direk sürekli işçi olarak alacak. Çünke en çok sürekli işçi var.
    protected void mesai(){
        System.out.println("Isciler gunluk 8 saat ve haftada 5 gun calisir");
    }
}
