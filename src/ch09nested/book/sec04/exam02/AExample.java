package ch09nested.book.sec04.exam02;

public class AExample {

    public static void main(String[] args) {
        A a = new A();

        a.useB();
    }
}

class A {

    void useB() {
        class B {
            int field1 = 1;

            static  int field2 = 2;

            B() {
                System.out.println("B생성자 실행");
            }

            void method1() {
                System.out.println("B.method1");
            }

            static void method2() {
                System.out.println("B.method2");
            }
        }

        B b = new B();

        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }

}