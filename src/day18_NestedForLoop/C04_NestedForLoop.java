package day18_NestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {


        /*

        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *

         */
        int input=6;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        for (int i =input-1 ; i >=1 ; i--) {
            for (int j = i; j>=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        /*
        for (int i = 1; i <=input-1 ; i++) {
            for (int j = 1; j <=input-i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

 */
    }
}
