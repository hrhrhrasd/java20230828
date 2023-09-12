package ch17stream.book.qq;

import java.util.Arrays;
import java.util.List;

public class Q06 {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("김자바", 26)
        );
        double avg = list.stream()
                .map(e -> e.getAge())
                .reduce(0,(r,e) -> r+e/ list.size());

        System.out.println("avg = " + avg);

        System.out.println("reduce로 가장 작은값 출력");
        int min_age = list.stream()
                .map(e->e.getAge())
                .reduce(list.get(0).getAge(),(r,e) -> r < e? r:e);
        System.out.println(min_age);

        System.out.println("reduce로 가장 큰값 출력");
        int max_age = list.stream()
                .map(e->e.getAge())
                .reduce(list.get(0).getAge(),(r,e) -> r > e? r : e);
        System.out.println(max_age);
    }
}
class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
