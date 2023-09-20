package ch12api.book.sec11.exam01;

public class GetClassEx {
    public static void main(String[] args) {
        Class clazz = Car.class;

        System.out.println("패키지 : " + clazz.getPackage().getName());
        System.out.println("패키지 : " + clazz.getPackageName());

        System.out.println("클래스 간단 이름 " + clazz.getSimpleName());
        System.out.println("클래스 상세 이름 " + clazz.getName());
    }
}
