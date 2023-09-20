package ch12api.lecture;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class C31annotation {
    @Override
    @MyAnootation31
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<C31annotation> c1 = C31annotation.class;
        Method m1 = c1.getDeclaredMethod("toString");
        Annotation[] anno = m1.getDeclaredAnnotations();
        System.out.println("anno.length = " + anno.length);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnootation31 {
    
        }
