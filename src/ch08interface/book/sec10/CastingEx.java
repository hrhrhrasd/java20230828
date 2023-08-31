package ch08interface.book.sec10;

public class CastingEx {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.run();

        Bus bus = (Bus)vehicle;
        bus.run();
        bus.check();
    }
}

interface  Vehicle {
    void run();
}

class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다");
    }

    public void check() {
        System.out.println("승차요금을 체크합니다");
    }
}
