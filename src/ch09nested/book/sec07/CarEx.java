package ch09nested.book.sec07;


public class CarEx {
    public static void main(String[] args) {
        Car car = new Car();

        car.run1();
        car.run2();

       car.run3(new Tire() {
           @Override
           public void roll() {
               System.out.println("익명 자식 타이어3");
           }
       });
    }
}

class Tire {
    public void roll() {
        System.out.println("타이어가 굴러갑니다");
    }
}

class Car {
    private Tire tire1 = new Tire();

    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("익명 자식 tire 객체 1");
        }
    };

    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    public void run2() {
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("익명자식 타이어2");
            }
        };
        tire.roll();
    }

    public void run3(Tire tire) {
        tire.roll();
    }
}