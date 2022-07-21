package day36_inheritance;

public class Child extends Parent{
    Child(){
        super(); //Burda bizim görmediğimiz super(); var. Bunu şimdi biz yazdik ama yazmasak da burda super() var.
        System.out.println("Child Cons. calisti");
    }
    // Tum class'larda biz gormesek bile
    // Java'nin olusturdugu default constructor vardir

    // Extends keyword kullanan class'lardaki  //extends kullanildiysa(demek ki bunun bir parent'i var o zaman super cons. calişir)
    // Tum CONSTRUCTOR'larin ilk satirinda
    // biz gormesek bile super()  //PARENT CLASS YANİ
    // constructor call vardir
    // yani parent class'in parametresiz constructor call
    public static void main(String[] args) {
        Child child = new Child();
    }
    }

