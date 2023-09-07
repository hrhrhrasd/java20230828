package ch13generic.lecture;

public class C06wildcard {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a1 = d;
        Cat c = new Cat();
        Animal a2 = c;

        MyClass06<Dog> o1 = new MyClass06<>();
//        MyClass06<Animal> o2 = o1;
//        o2.set(new Animal());

        MyClass06<? extends Animal> o2 = o1;
        Animal ani1 = o2.get(); //안전
//        o2.set(new Dog());  //안전하지 않음
        ani1.animethod();   //안전하게 사용하기 위함
        Animal aaaa = o1.get();
        aaaa.animethod();

        MyClass06<? super  Animal> o3 = new MyClass06<Animal>();
        MyClass06<? super  Animal> o4 = new MyClass06<Object>();
//        MyClass06<? super  Animal> o5 = new MyClass06<Dog>();
        o3.set(new Dog());
        o4.set(new Animal());
        o3.set(new Cat());
//        o4.set(new String());
    }
}

class Animal {
    public void animethod() {

    }
}
class Dog extends Animal {}
class Cat extends Animal {}
class MyClass06<T> {
    public void set(T t) {

    }

    public T get() {
        return null;
    }
}