package ch09nested.book.sec05.exam01;

public class AExample {
}

class A {
    int field1;
    void method1() {}

    static int field2;
    static void method2() {}

    class B {
        void method() {
            field1 = 10;
            method1();
            field2 = 10;
            method2();
        }
    }

    static class C {
        void method() {
//            field1 = 10;      //인스턴스멤버 접근 불가
//            method1();
            field2 = 10;
            method2();
        }
    }
}