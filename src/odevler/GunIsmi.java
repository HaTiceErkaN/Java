package odevler;

import java.util.Scanner;

public class GunIsmi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Soru5 : Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim

        System.out.println("Lutfen gun ismi giriniz");
        String gunIsmi = scan.nextLine().toLowerCase();

        switch (gunIsmi) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("lutfen gecerli birgun ismi giriniz");

        }
    }
}
