package ch07extends.lecture;

import ch07extends.lecture.package1.C31accessmodifire;

public class MyClass30{
    private void privateMethod() {
        System.out.println("MyClass30.privateMethod");
    }

    public void publicMethod() {
        System.out.println("MyClass30.publicMethod");

        //private 멤버(필드, 생성자, 메소드) 접근 가능
        privateMethod();
    }

    void defaultMethod() {
        System.out.println("MyClass30.defaultMethod");

        privateMethod();
    }

    protected void protectedMethod() {
        System.out.println("MyClass30.protectedMethod");
    }
}
