package ch16lamda.lecture;

public class C10constructorRef {
    public static void main(String[] args) {
        MyInterface10 o1 = () -> {
            return new MyClass10();
        };

        MyInterface10 o2 = () -> new MyClass10();

        MyInterface10 o3 = MyClass10::new;
    }
}

interface MyInterface10 {
    MyClass10 method();
}

class MyClass10 {

}
