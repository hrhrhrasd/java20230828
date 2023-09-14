package ch11exception.lecture;

public class C05printStrackTrace {
    public static void main(String[] args) {
        System.out.println("code1");

        try {
            int i = 0;
            int j = 3 / i;
            System.out.println("code2");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        System.out.println("code3");
    }
}
