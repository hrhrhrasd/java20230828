package ch08interface.book.sec07;

public class ServiceEx {
    public static void main(String[] args) {
        Service service = new SeviceImpl();

        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();

        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
    }
}

interface Service {
    default void defaultMethod1() {
        System.out.println("defaultMethod1 종속 코드");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("defaultMethod2 종속 코드");
        defaultCommon();
    }

    private void defaultCommon() {
        System.out.println("default 중복 코드A");
        System.out.println("default 중복 코드B");
    }

    static void staticMethod1() {
        System.out.println("staticMethod1 종속 코드");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }

    private static void staticCommon() {
        System.out.println("static 중복 코드A");
        System.out.println("static 중복 코드B");
    }
}

class SeviceImpl implements Service {}