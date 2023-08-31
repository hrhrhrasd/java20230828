package ch08interface.lecture;

public class C02interface {
    public static void main(String[] args) {
        MyClass021 o1 = new MyClass021();
        MyInterf02 i1 = o1;

        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(i1));

        MyInterf02 i2 = new MyClass021();
        System.out.println(System.identityHashCode(i2));

        o1.method1();
        o1.method2();

        MyInterf02 i3 = new MyClass022();
        i3.method1();
        i3.method2();

    }
}

interface MyInterf02 {
    abstract public void method1();

    void method2(); // abstrac public 는 생략 가능(디폴트값)
}

class MyClass021 implements MyInterf02 {
    @Override
    public void method1() {
        System.out.println("MyClass021.method1");
    }

    @Override
    public void method2() {
        System.out.println("MyClass021.method2");
    }
}

class MyClass022 implements MyInterf02 {
    @Override
    public void method1() {
        System.out.println("MyClass022.method1");
    }

    @Override
    public void method2() {
        System.out.println("MyClass022.method2");
    }
}
