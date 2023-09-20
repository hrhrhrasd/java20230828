package ch12api.lecture;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class C32annotation {
    public static void main(String[] args) throws NoSuchMethodException {
        MyClass32 o1 = new MyClass32();
        int value = o1.getValue();
        int number = o1.getNumber();

        Class<? extends MyClass32> c = o1.getClass();
        Method m1 = c.getDeclaredMethod("getNumber");

        MyAnnotation32 a1 = m1.getAnnotation(MyAnnotation32.class);
        if (a1 != null) {
            System.out.println(number + "를 어노테이션 적용");
        } else {
            System.out.println(number + "어노테이션 없음");
        }

        Class<? extends MyClass32> c2 = o1.getClass();
        Method m2 = c.getDeclaredMethod("getValue");

        MyAnnotation32 a2 = m2.getAnnotation(MyAnnotation32.class);
        if (a2 != null) {
            System.out.println(value + "를 어노테이션 적용");
        } else {
            System.out.println(value + "어노테이션 없음");
        }
    }
}

class MyClass32 {
    @MyAnnotation32
    public int getValue() {
        return 300;
    }

    public int getNumber() {
        return 500;
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation32 {

}
