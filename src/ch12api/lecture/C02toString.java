package ch12api.lecture;

public class C02toString {
    public static void main(String[] args) {
        MyClass02 o1 = new MyClass02();
        System.out.println(o1.toString());

        Object o2 = o1;
        System.out.println(o2.toString());
    }
}

class MyClass02 {
    @Override
    public String toString() {
        return "MyClass02객체 입니다.";
    }
}
