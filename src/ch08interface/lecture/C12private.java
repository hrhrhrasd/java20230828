package ch08interface.lecture;

public class C12private {
}

interface MyInterf12 {
    //public 인스턴스 메소두
    default void method1() {
        System.out.println("기능2");
    }

    default void  method2() {
        System.out.println("기능3");
    }

    private void  someFeature() {
        System.out.println("기능1");

    }
}
