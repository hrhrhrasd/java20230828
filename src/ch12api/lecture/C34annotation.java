package ch12api.lecture;

public class C34annotation {
    @MyAnnotation34("seoul")
    int field;
}

@interface MyAnnotation34 {
    String value(); //엘레멘트 이름이 vale면 사용시 생략가능
}