package ch07extends.lecture;

public class C24constructor {

}

class MyClass24 {
    int age;
    MyClass24(int age) {
        this.age = age;
    }
}

class MySubClass241 extends MyClass24 {
    //명시적으로 상위 클래스 생성자 호출 코드 작성
    MySubClass241() {
        super(30);
    }
}