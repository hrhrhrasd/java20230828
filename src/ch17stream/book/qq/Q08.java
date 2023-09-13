package ch17stream.book.qq;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q08 {
    public static void main(String[] args) {
        List<Member1> list = Arrays.asList(
                new Member1("홍길동", "개발자"),
                new Member1("김나리", "디자이너"),
                new Member1("신용권", "개발자")
        );

        Map<String, List<Member1>> map = list.stream()
                        .collect(Collectors.groupingBy(s-> s.getJob()));

        List<Member1> eng = map.get("개발자");
        List<Member1> dsi = map.get("디자이너");


        System.out.println("개발자");
        eng.stream().forEach(System.out::println);
        map.get("개발자").forEach(System.out::println);

        System.out.println("디자이너");
        dsi.stream().forEach(System.out::println);
    }
}

class Member1 {
    private String name;
    private String job;

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public Member1(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}