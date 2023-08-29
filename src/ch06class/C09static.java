package ch06class;

public class C09static {
}

class Myclass09 {
    String name;
    static String model;

    void printName() {
        System.out.println("name = " + name);

        System.out.println("model = " + model); //인스턴스에서 스태틱 접근가능
    }

    static void printModel() {
        System.out.println("model = " + model);

//        System.out.println("name = " + name);     //스태틱에서 인스턴스 접근 불가
    }
}