package day17_forLoop;

public class C03_FoorLoop {
    public static void main(String[] args) {

        //Ekrana 10 kere "Java guzeldir yazdirin"
        /*
        System.out.println("Java guzeldir");
        System.out.println("Java guzeldir");
        System.out.println("Java guzeldir");
        System.out.println("Java guzeldir");
        System.out.println("Java guzeldir");
        System.out.println("Java guzeldir");
        System.out.println("Java guzeldir");
        System.out.println("Java guzeldir");
        System.out.println("Java guzeldir");
        System.out.println("Java guzeldir");
        System.out.println("Java guzeldir");
        
        */

        for (int i = 1; i <=10 ; i++) {
            // i=0 olursa 10 degil 11 tane yazar
            System.out.println("Java guzeldir");
            System.out.println(i+ "-Java guzeldir");
            
        }


    }
}
