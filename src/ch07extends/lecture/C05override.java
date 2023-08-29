package ch07extends.lecture;

public class C05override {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();
        o1.method1();

        MySubClass051 o2 = new MySubClass051();
        o2.method2();
        o2.method1();
    }
}

class MyClass05 {
    public void method1() {
        System.out.println("메소드1기능");
    }
}

class MySubClass051 extends MyClass05{
    public void  method2() {
        System.out.println("추가된 기능");
    }
    public void method1() {
        System.out.println("메소드1 오버라이딩");       //오버라이딩
    }
}