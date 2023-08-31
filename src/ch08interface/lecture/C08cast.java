package ch08interface.lecture;

public class C08cast {
    public static void main(String[] args) {
        MyInterf08 m1 = new MyClass081();
        m1.method1();

        MyClass081 o1 = (MyClass081)m1;
        o1.method2();
    }
}

interface MyInterf08 {
    void method1();
}

class MyClass081 implements MyInterf08 {
    @Override
    public void method1() {
        System.out.println("추상 메소드 구현");
    }

    public void method2() {
        System.out.println("새로운 메소드");
    }
}