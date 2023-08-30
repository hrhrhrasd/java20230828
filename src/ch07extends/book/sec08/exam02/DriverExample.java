package ch07extends.book.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        driver.drive(new Bus());

        driver.drive(new Taxi());
    }
}
