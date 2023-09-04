package ch09nested.book.sec07;

public class Q06 {
    public static void main(String[] args) {
        Anonymous a1 = new Anonymous();
        a1.field.run();
        a1.method1();
        a1.method2(new Vehicle() {
            @Override
            public void run() {
                System.out.println("트럭이 달립니다");
            }
        });

        a1.method2(()-> System.out.println("트럭이 달립니다2"));
    }
}

interface Vehicle {
    public void run();
}

class Anonymous {
    Vehicle field = new Vehicle() {
        @Override
        public void run() {
            System.out.println("자전거가 달립니다");
        }
    };
    Vehicle field2 = () -> System.out.println("자전거가 달립니다2");


    void method1() {
        Vehicle localVar = new Vehicle() {
            @Override
            public void run() {
                System.out.println("승용차가 달립니다");
            }


        };
        localVar.run();

        Vehicle localVar2 = () -> System.out.println("승용차가 달립니다2");
        localVar2.run();
    }
    void method2(Vehicle v) {
        v.run();
    }

}