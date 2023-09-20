package ch05reference;

public class C13enum {
    public static void main(String[] args) {
        MyEnum v1 = MyEnum.VALUE1;
        MyEnum v2 = MyEnum.VALUE2;
        MyEnum v3 = MyEnum.VALUE3;
        MyEnum v4 = MyEnum.MY_FIRST_VALUE;
        MyEnum v5 = MyEnum.VALUE1;

        System.out.println("(v1==v5) = " + (v1==v5)); // true
    }
}

enum  MyEnum {
    //,로 구분한 값 나열
    //이름 작성 관습 : UPPER_SNAKE_CASE
    VALUE1,
    VALUE2,
    VALUE3,
    MY_FIRST_VALUE
}
