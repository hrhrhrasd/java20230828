package ch17stream.book.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilterEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("김자바");
        list.add("신용권");
        list.add("신민철");

        list.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        list.stream()
                .filter(e -> e.startsWith("신"))
                .forEach(System.out::println);
        System.out.println();

        list.stream()
                .distinct()
                .filter(e ->e.startsWith("신"))
                .forEach(System.out::println);
    }
}
