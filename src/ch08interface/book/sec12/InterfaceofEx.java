package ch08interface.book.sec12;

public class InterfaceofEx {
    public static void main(String[] args) {

        Taxi taxi =new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);
    }

    public static void ride(Vehicle vehicle) {
        if (vehicle instanceof Bus bus){
            bus.cheak();
        }
    }
}

interface Vehicle {
    void run();
}

class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다");
    }

    public void cheak() {
        System.out.println("승차요금 체크");
    }
}

class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다");
    }
}
