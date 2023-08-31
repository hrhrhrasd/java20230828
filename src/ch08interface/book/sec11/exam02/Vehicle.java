package ch08interface.book.sec11.exam02;

public interface Vehicle {
    void run();
}

class Driver {
    void drive(Vehicle vehicle) {
        vehicle.run();
    }
}

class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다");
    }
}

class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다");
    }
}
