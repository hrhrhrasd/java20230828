package ch07extends.lecture;

public class C06override {
    public static void main(String[] args) {
        MySubClass061 o1 = new MySubClass061();
        o1.method10();
    }
}

class MyClass06 {
    public void method10() {
        System.out.println("부모클래스의 메소드");
    }
}

class MySubClass061 extends MyClass06 {

    @Override   //컴파일시 오버라이딩한 메소드인지 검증
    public void method10() {
        System.out.println("부모클래스의 메소드 오버라이딩");
    }
}