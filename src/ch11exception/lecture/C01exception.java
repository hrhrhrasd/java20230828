package ch11exception.lecture;

public class C01exception {
    public static void main(String[] args) {
        System.out.println("실행코드1");
        System.out.println("실행코드2");

        int i = 0;
        try {
            int j = 3/i;    //ArithmeticException
        }
        catch (Exception e) {
            System.out.println("asdasd");
        }





        System.out.println("실행코드3");
    }
}
