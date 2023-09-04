package ch09nested.lecture;

public class C08interface {
    public static void main(String[] args) {
        Myclass08 o1 = new Myclass08();
        o1.method1();
    }

    class ConcreteClass implements Myclass08.NestedInterface {
        @Override
        public void method2() {
            System.out.println("ConcreteClass.method21");
        }
    }

}

class MyClass081 implements Myclass08.NestedInterface {
    @Override
    public void method2() {
        System.out.println("MyClass081.method2");
    }
}

class Myclass08 {
    static interface NestedInterface {
        //public final static field
        //public abstract instance method *******중요
        //private instance method
        //default instance method
        //public static method
        //private static method

        void method2();
    }

    void method1() {
        class ConcreteClass implements NestedInterface {
            @Override
            public void method2() {
                System.out.println("ConcreteClass.method2");
            }
        }

        ConcreteClass c = new ConcreteClass();
        c.method2();

    }
}
