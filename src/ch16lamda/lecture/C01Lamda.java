package ch16lamda.lecture;

public class C01Lamda {
    MyInterface01 o1 = (x,y) -> {
        System.out.println(x+y);
    };

    MyInterface01 o2 = new MyInterface01() {
        @Override
        public void method(int x, int y) {
            System.out.println(x+y);
        }
    };
}

//람다식
// 추상 메소드가 하나인 인터페이스의 익명 클래스 객체를 만들 때 사용가능
interface MyInterface01 {
    void method(int x, int y);
}