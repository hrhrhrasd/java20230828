package ch09nested.lecture;

public class C04access {
    // static member 는 instance member에 접근 할 수 없다.

    int instanceField;
    static int staticField;

    static class StaticNestedClass {
        void method1() {
            System.out.println(staticField);
//            System.out.println(instanceField);       //불가
        }
    }

    class InnerClass {
        void method1() {
            System.out.println(instanceField);
            System.out.println(staticField);
        }

    }
}
