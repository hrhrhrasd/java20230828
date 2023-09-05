package ch12api.book.QQ;

import java.util.HashSet;
import java.util.Objects;

public class Q05 {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet();

        hashSet.add(new Student("1"));
        System.out.println(hashSet.size());
        hashSet.add(new Student("1"));
        System.out.println(hashSet.size());
        hashSet.add(new Student("2"));
        System.out.println(hashSet.size());
    }
}

class Student {
    private String num;

    public Student(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    @Override
    public boolean equals(Object o) {
        if (this.hashCode() == o.hashCode()) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return num != null ? num.hashCode() : 0;
    }
}