package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C09cast {
    public static void main(String[] args) {
        CharSequence c = "java";

        String s = (String) c;
        Object o = (Object) c;
        Serializable se = (Serializable) c;
        Comparable cp = (Comparable) c;
        Constable cs = (Constable) c;
        ConstantDesc cd = (ConstantDesc) c;

//        Number n = (Number) c;    불가능

        System.out.println("프로그램 종료");
    }
}
