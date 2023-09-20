package ch12api.lecture;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MyAnootation29
public class C29annotation {
    @MyAnootation29
    int field;
    @MyAnootation29
    public static void main(@MyAnootation29 String[] args) {
        @MyAnootation29
        int local;


    }
}

@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE,ElementType.METHOD,
ElementType.PARAMETER,ElementType.TYPE})
@interface MyAnootation29 {

}
