package ch13generic.lecture;

import java.util.HashMap;
import java.util.HashSet;

public class C05generic {
    public static void main(String[] args) {
        HashMap<String, Integer> h1 = new HashMap<>();

        MyClass05<String, Integer> o1 = new MyClass05<>();
        o1.setField("java");
        o1.setField2(500);

        MyClass05<Integer, String> o2 = new MyClass05<>();

    }
}

class MyClass05<T, U> {
    private T field;
    private U field2;

    public U getField2() {
        return field2;
    }

    public void setField2(U field2) {
        this.field2 = field2;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}
