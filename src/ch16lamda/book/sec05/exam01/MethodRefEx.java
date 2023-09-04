package ch16lamda.book.sec05.exam01;

import ch07extends.book.Calculator.Calculator;

public class MethodRefEx {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(Computer::staticMethod);

        Computer c = new Computer();
        person.action(c::instanceMethod);
    }
}

class  Computer {
    public static double staticMethod(double x, double y) {
        return x+y;
    }

    public double instanceMethod(double x, double y) {
        return  x*y;
    }
}

interface Calculable {
    double calc(double x, double y);
}

class Person {
    public void action(Calculable calculable) {
        double result = calculable.calc(10,4);
        System.out.println("result = " + result);

    }
}