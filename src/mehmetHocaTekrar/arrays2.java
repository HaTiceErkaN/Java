package mehmetHocaTekrar;

import java.util.Arrays;

public class arrays2 {
    public static void main(String[] args) {

       // Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
      //  ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
        
        int array [][]={{1,2,3},{4,5},{6}};
        int carpim=1;

        for (int i = 0; i < array.length ; i++) {
            for (int j =0; j <1 ; j++) {

                carpim*=array[i][j];
                
            }
            
        }
        System.out.println(carpim);

        


    }
}

