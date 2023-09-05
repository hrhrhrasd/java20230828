package ch16lamda.lecture;

import java.util.stream.IntStream;

public class C12constructorRef {
    public static void main(String[] args) {
        for (int i=1; i<10;i++) {
            Student s = new Student(i);
            System.out.println(s);
        }

        System.out.println("========================");

        IntStream.range(1, 10)
                .mapToObj(Student::new)
                .forEach(System.out::println);
    }
}

class Student {
    private  int number;

    Student(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                '}';
    }
}
