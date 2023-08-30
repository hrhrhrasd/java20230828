package ch07extends.lecture;

import ch07extends.book.sec07.exam03.Parent;

public class C14type {
    //기본타입
    int a = 3;
    double f = 3.0;
    double g = 32;

    //참조타입
    String b = "java";
    Object o = "java";
    Child c = new Child();
    Parentt d = new Parentt();
}

class Parentt {}

class Child extends Parent {}
