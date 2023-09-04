package ch16lamda.book.sec04;

public class LamdaEx {
    public static void main(String[] args) {
        Person o1 = new Person();
        o1.action((x,y)-> {
            double result = x + y;
            return result;
        });

        o1.action((x,y) -> (x+y));

        o1.action(((x, y) -> sum(x,y)));

        o1.action(LamdaEx::sum);
    }
    public static double sum (double x, double y) {
        return x+y;
    }
}

interface Calcuabl {
    double calc(double x, double y);
}

class Person {
    public void action(Calcuabl calcuabl) {
        double result = calcuabl.calc(10, 40);
        System.out.println("result = " + result);
    }
}