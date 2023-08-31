package ch08interface.book.sec11.exam01;

public class CarEx {
    public static void main(String[] args) {
        Car mycar = new Car();

        mycar.rum();

        mycar.tire1 = new HanT();
        mycar.tire2 = new KumT();

        mycar.rum();
    }
}
