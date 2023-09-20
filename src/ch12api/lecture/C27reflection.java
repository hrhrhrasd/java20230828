package ch12api.lecture;

public class C27reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        MyClass27 o1 = new MyClass27();
        Class<? extends MyClass27> c1 = o1.getClass();
        Class<MyClass27> c2 = MyClass27.class;
        Class<?> c3 = Class.forName("ch12api.lecture.MyClass27");

        System.out.println("c1.equals(c2) = " + c1.equals(c2));
        System.out.println("c2.equals(c3) = " + c2.equals(c3));
    }
}

class MyClass27 {
    
}
