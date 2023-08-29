package ch07extends.lecture;

public class C01extends {
    public static void main(String[] args) {
        Myclass01 o1 = new Myclass01();



        MySubclass011 o2 = new MySubclass011();
        o2.age = 44;
        o2.method1();

        o1.age = 33;
        o1.method1();
    }
}

class MySubclass011 extends Myclass01{  //Myclass01의 멤버(필드,메소드)를 상속받음

}


class Myclass01 {
    int age;

    void method1() {
        System.out.println("Myclass01.method1");
        System.out.println(age);
    }
}
