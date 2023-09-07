package ch13generic.lecture;

public class C09genericMethod {
    public static void main(String[] args) {
        MyClass09 o1 = new MyClass09();
        o1.<Object>method(new Object());
        o1.<String>method("java");

        o1.method(new Object());
        o1.method("java");

        Object o = o1.method1();
        String s = o1.method1();
    }

}

class MyClass09 {
    public <T> void method(T param) {

    }

    public <T> T method1() {
        return null;
    }
}
