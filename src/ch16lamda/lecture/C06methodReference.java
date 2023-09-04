package ch16lamda.lecture;

public class C06methodReference {
    public static void main(String[] args) {
        MyInterface06 o1 = a -> C06methodReference.someMethod(a);{};

        //메소드 참조 (method reference
        MyInterface06 o2 = C06methodReference::someMethod;
        MyInterface06 o3 = new MyInterface06() {
            @Override
            public void method(int a) {
                someMethod(a);
            }
        };



    }

    public static void someMethod(int x) {

    }
}

interface MyInterface06 {
    void method(int a);
}
