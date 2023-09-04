package ch16lamda.lecture;

public class C02lamda {
    public static void main(String[] args) {
        //lamda
        //(파라미터) -> {메소드 몸통}
        MyInterface02 o1 = ()-> {
            System.out.println("C02lamda.main");
        };
        o1.method();

        MyInterface02 o2 = () -> System.out.println("C02lamda1.main");
        o2.method();
    }
}

@FunctionalInterface
interface  MyInterface02 {
    //파라미터 없는 메소드
    void method();
}
