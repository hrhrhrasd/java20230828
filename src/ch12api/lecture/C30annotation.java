package ch12api.lecture;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class C30annotation {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<C30annotation> c = C30annotation.class;
        Method m1 = c.getDeclaredMethod("toString");
        System.out.println("m1.getName() = " + m1.getName());
        Annotation[] annos = m1.getDeclaredAnnotations();
        System.out.println("annos.length = " + annos.length);
    }
}
