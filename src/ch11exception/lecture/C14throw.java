package ch11exception.lecture;

public class C14throw {
    public static void main(String[] args) {
        System.out.println("main code1");
        try {
            method3();
            System.out.println("main code2");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main code3");
    }

    public static void method3() throws Exception {
        throw new Exception();
    }
}
