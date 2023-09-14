package ch11exception.lecture;

public class C13throw {
    public static void main(String[] args) {
        System.out.println("main code1");

        try {
            method1();
            System.out.println("main code2");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main code 3");
    }

    public static void method1() {
        System.out.println("code1");
        throw new RuntimeException();

    }

    public static void method2() {

    }
}
