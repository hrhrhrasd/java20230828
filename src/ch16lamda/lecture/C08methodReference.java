package ch16lamda.lecture;

public class C08methodReference {
    public static void main(String[] args) {
        MyClass08 o2 = new MyClass08();
        MyInterface08 o1 = o2::otherMethod;
    }
}

interface MyInterface08 {
    void method(int x, int y);
}
class MyClass08 {
    void otherMethod(int x, int y) {

    }
}