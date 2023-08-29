package ch07extends.lecture;

public class C02extends {
    public static void main(String[] args) {
        MySubClass021 o1 = new MySubClass021();
        o1.name = "spring";
    }
}

class Myclass02 {           //상위클래스, 부모클래스, super class
    String name;

    void method3() {
        System.out.println("name = " + name);
    }
}


class MySubClass021 extends Myclass02 {     //하위클래스, 자식클래스, sub class

}
