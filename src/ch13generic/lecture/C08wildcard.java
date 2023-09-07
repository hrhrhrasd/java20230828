package ch13generic.lecture;

public class C08wildcard {
    public static void main(String[] args) {
        MyClass08<?> o1 = new MyClass08<Animal>();
        MyClass08<?> o2 = new MyClass08<Cat>();
        MyClass08<?> o3 = new MyClass08<Dog>();
        MyClass08<?> o4 = new MyClass08<Object>();
        //Object 의 메소드 사용

//        MyClass08<Object> o5 = new MyClass08<Dog>(); //안됨


    }

    public void someMethod(MyClass08<?> param) {
        param.equals('a');
        param.hashCode();
        param.toString();
    }

    public void otherMethod() {
        someMethod(new MyClass08<Object>());
        someMethod(new MyClass08<Cat>());
        someMethod(new MyClass08<Dog>());
        someMethod(new MyClass08<Animal>());
    }
}

class MyClass08<T> {

}