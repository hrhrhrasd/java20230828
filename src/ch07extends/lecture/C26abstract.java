package ch07extends.lecture;

public class C26abstract {
    public static void main(String[] args) {
        Dog26 d1 = new Dog26();
        Fish f1 = new Fish();

        Animal26 a1 = d1;
        Animal26 a2 = f1;
    }
}

//추상 메소드를 가진 클래스는 반드시 추상 클래스가 되어야 함
abstract class Animal26 {
    //추상 메소드 : 몸통이 없는 메소드
    abstract public void breath();
}

class Dog26 extends Animal26 {
    //추상 메소드 재정의
    @Override
    public void breath() {
        System.out.println("폐 호흡");
    }
}


class Fish extends Animal26 {
    @Override
    public void breath() {
        System.out.println("아가미 호흡");
    }
}