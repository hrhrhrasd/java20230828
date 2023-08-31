package ch07extends.lecture;

public class C30accessModifier {
    public static void main(String[] args) {
        //접근제어자(access modifire)
        //public    :가장 넓은 범위, 어디서든 접근가능
        // protected    : 같은 패키지 + 다른 패키지의 자식클래스 에서 접근 가능
        // (default = package Private)  : 같은 패키지 내에서 접근가능
        // private  :가장 좁은 범위, 클래스 내에서만 접근 가능
        MyClass30 o1 = new MyClass30();
        o1.publicMethod();
//        o1.privateMehod();    //private 접근 불가 (다른 클래스)
        o1.defaultMethod();
        o1.protectedMethod();
    }
}

