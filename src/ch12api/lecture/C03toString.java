package ch12api.lecture;

public class C03toString {
    public static void main(String[] args) {
        Car c1 = new Car("tesla", 5000);
        Car c2 = new Car("kia", 3000);
        Car c3 = new Car("bmw", 2000);

        System.out.println(c1.getModel() + c1.getPrice());
        System.out.println(c2.getModel() + c2.getPrice());
        System.out.println(c3.getModel() + c3.getPrice());

        System.out.println(c1.toString());
    }
}

class Car {
    private  String model;
    private  int price;

    public Car( String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}