package ch08interface.book.sec11.exam02;

import ch07extends.book.sec06.pack2.D;

public class DriverEx {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus =new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);
    }
}
