package ch15collection.lecture;

import ch08interface.book.sec10.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C03contains {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add(new String("java"));
        list1.add(new String("spring"));

        System.out.println(list1.contains(new String("java")));

        List<MyClass03> list2 = new ArrayList<>();
        list2.add(new MyClass03("흥민", new Asd(1)));
        list2.add(new MyClass03("강인", new Asd(1)));

        System.out.println(list2.contains(new MyClass03("흥민", new Asd(1))));

    }
}

class MyClass03 {
    private String name;
    private Asd a;

    public MyClass03(String name, Asd a) {
        this.name = name;
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyClass03 myClass03 = (MyClass03) o;

        if (!Objects.equals(name, myClass03.name)) return false;
        return Objects.equals(a, myClass03.a);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (a != null ? a.hashCode() : 0);
        return result;
    }
}

class Asd {
    int a;

    public Asd(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Asd asd = (Asd) o;

        return a == asd.a;
    }

    @Override
    public int hashCode() {
        return a;
    }
}