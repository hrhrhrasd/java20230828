package ch16lamda.book.QQ;


public class Q06 {
    public static double clac(Function fun) {
        double x = 10;
        double y = 4;
        return  fun.apply(x,y);
    }

    public static void main(String[] args) {
        double result = clac( (x,y)-> (x/y));
        System.out.println("result = " + result);

    }
}

interface Function{
    public double apply(double x, double y);
}

