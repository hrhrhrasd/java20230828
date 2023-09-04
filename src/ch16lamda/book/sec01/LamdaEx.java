package ch16lamda.book.sec01;

public class LamdaEx {
    public static void main(String[] args) {
        Calculable o1 = (x, y) -> {
            int result = x*y;
            System.out.println("result = " + result);
        };
        o1.claculate(10,4);

        action((x, y) -> {
            int result = x + y;
            System.out.println("result = " + result);
        });

        action((x, y) -> {
            int result = x - y;
            System.out.println("result = " + result);
        });



    }

    public static void action(Calculable calculable) {
        int x = 10;
        int y = 4;
        calculable.claculate(x,y);
    }
}

//Functional Interface
//추상메소드가 하나인 인터페이스
@FunctionalInterface
interface Calculable {
    void claculate(int x, int y);
    default void method1() {
        //얘는 상관없음
    }
}