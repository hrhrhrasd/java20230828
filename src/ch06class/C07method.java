package ch06class;

public class C07method {
    public static void main(String[] args) {
        Myclass07 o1 = new Myclass07();
        Myclass07 o2 = new Myclass07();

        o1.myMethod1();
        o2.myMethod1();

        o1.name= "java";
        o2.name= "spring";

        o1.printname();
        o2.printname();
    }
}

class Myclass07 {
    String name;

    void myMethod1() {
        System.out.println("myMethod1 실행됨");
        System.out.println("Myclass07.myMethod1");  //soutm
    }

    void printname() {
        System.out.println(name);
    }
}

