package day17_forLoop;

public class C04_FoorLoop {
    public static void main(String[] args) {

        // 10-30 arasindaki (10-30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdir

        for (int i = 10; i <=29 ; i++) {
            System.out.print(i+ ",");
            }
        System.out.println(30);


        int baslangic=10;
        int bitis=30;

        for (int i = baslangic; i <=bitis ; i++) {

            if (i<bitis){
                System.out.print(i+",");
            }else{
                System.out.println(i);
            }

        }
    }
}
