package ch16lamda.lecture;

public class C07methodReference {
    public static void main(String[] args) {
        MyInterface07 o1 = (x, y, z) -> MyClass07.otherMethod(x,y,z);
        MyInterface07 o2 = MyClass07::otherMethod;
    }
}

class MyClass07 {
    static void otherMethod(int x, int y, int z) {

    }
}

interface MyInterface07 {
    void method(int x, int y, int z);
}
