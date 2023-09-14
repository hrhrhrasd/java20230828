package ch11exception.book.sec02.exam02;

public class ExceptionHandlingEx {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("클래스가 존재합니다");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();

        try {
            Class.forName("java.lang.String2");
            System.out.println("String2 클래스 존재");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 끝");
    }
}
