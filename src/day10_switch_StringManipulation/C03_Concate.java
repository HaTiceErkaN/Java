package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {

        // concatination yapmak icin 2 ihtimal var
        // istersek daha once yaptigimiz gibi + operatorunu kullanabiliriz veya
        // String class'indan gelen concat methood'unu kullanabiliriz

        String str1= "Java";
        String str2= "Candir";

        // Java Candir yazdiralim
        System.out.println(str1+" "+str2);

        String cumle= str1.concat(str2); // str1 'i yazdiracak sonrasina str2'yi cocat edecek(yapistiracak)//JavaCandir
        cumle= str1.concat(" ").concat(str2);  //Java Candir
        cumle=str1.concat(" "+str2);

        System.out.println(cumle);

        // concat icine string degil de int, boolean yazsak?
        // cumle=str1.concat(5); //kabul etmiyor ama mesela soyle kabul eder concat(""+5) o zaman olur
        // cumle=str1.concat(str2)+5 de yazilabilir




    }
}
