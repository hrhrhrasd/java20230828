package ch13generic.book.QQ;

public class Q02 {
    public static void main(String[] args) {
        Container<String> o1 = new Container<>();
        o1.setA("홍길동");
        String str = o1.getA();

        Container<Integer> o2 = new Container<>();
        o2.setA(6);
        int i = o2.getA();;

        System.out.println(str + ", " + i);

    }
}

class Container<T> {
    private T a;

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }
}
