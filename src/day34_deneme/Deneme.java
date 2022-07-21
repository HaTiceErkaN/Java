package day34_deneme;

import day34_accesModifier_enCapsulation.C01;

public class Deneme {
    public static void main(String[] args) {

      //  C01 obj=new C01();  obje olusturulamiyor cunku bu constructor'ın access modifier'i default acces modifierdir.
        // Dolayisiyle baska packega'dan kullanilamaz
        C01.halkaAcikSayi=13;

    }
}
