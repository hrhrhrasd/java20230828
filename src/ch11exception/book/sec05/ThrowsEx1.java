package ch11exception.book.sec05;

public class ThrowsEx1 {
    public static void main(String[] args) {
        try {
            finClass();
        } catch (ClassNotFoundException e) {
            System.out.println("예외 처리: " +e.toString());
        }
    }

    public static void finClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
