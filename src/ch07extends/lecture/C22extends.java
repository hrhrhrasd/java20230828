package ch07extends.lecture;

public class C22extends {
    public static void main(String[] args) {
        MySubClass221 o1 = new MySubClass221();
    }
}

class MyClass22 {
    MyClass22() {
        //초기화 코드
        System.out.println("상위 클래스 생성자");
    }
}

class MySubClass221 extends MyClass22{
    MySubClass221() {
        super();    //상위 클래스 생성자 호출 필수
        //MySubClass221 초기화 코드

        System.out.println("하위 클래스 생성자");
    }
}