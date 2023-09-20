package ch12api.book.sec12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;

public class PrintAnnotationEx {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = Service.class.getDeclaredMethods();
        for (Method method : methods) {
            PrintAnnotation printAnnotation = method.getAnnotation(
                    PrintAnnotation.class
            );

            printLine(printAnnotation);

            method.invoke(new Service());

            printLine(printAnnotation);
        }
    }

    public static void printLine(PrintAnnotation printAnnotation) {
        if (printAnnotation != null) {
            int number = printAnnotation.number();
            for (int i = 0; i < number; i++) {
                String value = printAnnotation.value();;
                System.out.print(value);
            }
            System.out.println();
        }
    }
}

class Service {
    @PrintAnnotation
    public void method1() {
        System.out.println("실행내용1");
    }

    @PrintAnnotation("*")
    public void method2() {
        System.out.println("실행내용2");
    }

    @PrintAnnotation(value = "#", number = 20)
    public void method3() {
        System.out.println("실행내용3");
    }
}
