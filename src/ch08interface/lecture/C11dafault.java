package ch08interface.lecture;

public class C11dafault {
    public static void main(String[] args) {
        MyInterf11 i1 = new MyClass111();
        MyInterf11 i2 = new MyClass112();

        i1.method1();
        i1.method2();

        i2.method1();
        i2.method2();

    }

}

interface MyInterf11 {
    void method1();
    default void method2() {
        //몸통이 있는 public 인스턴스 메소드
        //필요하다면 재정의 가능
        System.out.println("MyInterf11.method2");
    }
}

class MyClass111 implements MyInterf11 {
    @Override
    public void method1() {
        System.out.println("MyClass111.method1");
    }
}

class MyClass112 implements  MyInterf11 {
    @Override
    public void method1() {
        System.out.println("MyClass112.method1");
    }
}