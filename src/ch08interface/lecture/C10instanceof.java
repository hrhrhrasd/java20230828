package ch08interface.lecture;

import javax.naming.Name;

public class C10instanceof {
    public static void main(String[] args) {
        //instanceof
        //연산결과 : boolean
        //좌변 : 참조변수
        //우변 : 타입(클래스, 인터페이스 등)

        CharSequence c = "java";

        if (c instanceof Name a) {
            System.out.println(a.hashCode());
        }

        System.out.println("asd");

    }
}

