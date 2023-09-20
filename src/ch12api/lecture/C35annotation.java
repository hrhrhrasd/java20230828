package ch12api.lecture;

public class C35annotation {
    @MyAnnotation35(name = {"son", " lee"})
    int field;
    @MyAnnotation35(name = "son")
    int field2;
}

@interface MyAnnotation35 {
    String[] name();
}