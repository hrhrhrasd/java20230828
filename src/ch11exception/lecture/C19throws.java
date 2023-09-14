package ch11exception.lecture;

public class C19throws {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void method1() throws Exception { //부모타입 exception으로 throws 가능
        method2();
    }
    public static void method2() throws ReflectiveOperationException {
        method3();
    }
    public static void method3() throws ClassNotFoundException{

    }
}
