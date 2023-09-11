package ch15collection.book.qq;

import java.util.HashSet;
import java.util.Set;

public class Q08 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student(1,"홍길동"));
        set.add(new Student(2,"조민우"));
        set.add(new Student(1,"홍길동"));

        System.out.println("저장된 객체수 : "+set.size());
        for(Student i : set) {
            System.out.println(i.stuNum + ":" + i.name);
        }
    }


}

class Student {
    public int stuNum;
    public String name;

    public Student(int stuNum, String name) {
        this.stuNum = stuNum;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return stuNum;
    }

    @Override
    public boolean equals(Object obj) {
            if (this.stuNum==stuNum)
                return true;
            else return false;
    }
}