package ch07extends.lecture;

public class C15cast {
    public static void main(String[] args) {
        Animal15 ani1 = new Dog15();
        Animal15 ani2 = new Cat15();

        Dog15 dog1 = (Dog15) ani1;      //dog1이 가르키는 실제 인스턴스값이 Dog15이기 때문에 가능
        Cat15 cat1 = (Cat15) ani2;

//        Cat15 cat2 = (Cat15) ani1;  //cat, dog는 관련없음. 불가

        Animal15 ani3 = new Animal15();
//        Dog15 dog3 = (Dog15) ani3(); //불가
    }
}


class Animal15 {}

class Dog15 extends Animal15 {}

class Cat15 extends Animal15 {}