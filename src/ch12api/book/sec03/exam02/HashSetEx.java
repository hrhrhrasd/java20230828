package ch12api.book.sec03.exam02;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");

        if (s1.hashCode() == s2.hashCode()) {
            if (s1.equals(s2)) {
                System.out.println("동등객체");
            } else {
                System.out.println("데이터가 다르므로 동등객체 아님");
            }
        } else {
            System.out.println("해시코드가 다르므로 동등객체 아님");
        }

        HashSet hashSet = new HashSet();

        Student s3 = new Student(2, "홍길동");


        hashSet.add(s1);
        System.out.println("저장된 객체수 " + hashSet.size());

        hashSet.add(s2);
        System.out.println("저장된 객체수 " + hashSet.size());

        hashSet.add(s3);
        System.out.println("저장된 객체수 " + hashSet.size());


    }
}

class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hashCode = no + name.hashCode();
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student target) {
            if (no == target.getNo() && name.equals(target.getName())) {
                return true;
            }
        }
        return false;
    }
}