package ch06class;

public class C02class {
    public static void main(String[] args) {
        Myclass02 o1 = new Myclass02();
        o1.name = "spring";

        method1(o1);
    }

    public static void method1(Myclass02 p) {
        p.name = "java";
    }
}

class Myclass02 {
    String name;
}
