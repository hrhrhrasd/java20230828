package ch08interface.book.sec11.exam01;

public class Car {
    Tire tire1 = new HanT();
    Tire tire2 = new HanT();

    void rum() {
        tire1.roll();
        tire2.roll();
    }
}
