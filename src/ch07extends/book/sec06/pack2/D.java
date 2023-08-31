package ch07extends.book.sec06.pack2;

import ch07extends.book.sec06.pack1.A;

public class D extends A {

    public D() {
        super();
    }

    public void method1() {
        this.field= "value";
        this.method();
    }

    public void method2() {
//        A a = new A();
//        a.field = "value";
//        a.method();
        super.field = "value";
        super.method();
    }
}
