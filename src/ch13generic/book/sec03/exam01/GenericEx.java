package ch13generic.book.sec03.exam01;

public class GenericEx {
    private static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.setT(t);
        return box;
    }
    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intValue = box1.getT();
        System.out.println(intValue);

        Box<String> box2 = boxing("홍길동");
        String strValue = box2.getT();
        System.out.println(strValue);
    }
}

class Box<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
