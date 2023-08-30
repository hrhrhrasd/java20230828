package ch07extends.lecture;

public class C18cast {
    public static void main(String[] args) {
        Animal18 ani1 = new Dog18();
        Animal18 ani2 = new Cat18();

        if (ani1 instanceof Dog18 d1) {
            d1.wow();
        } else {
            System.out.println("개 실패");
        }
    }
}

class Animal18 {}
class Dog18 extends Animal18{
    public void wow() {
        System.out.println("dhkd");
    }
}
class Cat18 extends Animal18{}