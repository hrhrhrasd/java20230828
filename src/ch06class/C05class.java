package ch06class;

public class C05class {
    public static void main(String[] args) {
        Myclass05 o1 = new Myclass05();
        
        o1.age = 30;
        o1.model = "java";
        System.out.println("o1.age = " + o1.age);

        Myclass05 o2 = new Myclass05();
        o2.age = 50;
        System.out.println("o1.age = " + o1.age);
        System.out.println("o2.age = " + o2.age);
        System.out.println("o1.model = " + o1.model);
        System.out.println("o2.model = " + o2.model);
    }
}


class Myclass05 {
    //속성
    int age;    //instance field
    static String model;    // static field, class field, 정적필드
}
