package ch08interface.book.sec10;

public class PromotionEx {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a;

        a = b;
        a = c;
        a = d;
        a = e;
    }
}
