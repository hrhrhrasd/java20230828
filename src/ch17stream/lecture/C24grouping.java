package ch17stream.lecture;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C24grouping {
    public static void main(String[] args) {
        List<String> list = List.of(
                "java",
                "spring",
                "css",
                "html",
                "react",
                "vue",
                "jquery",
                "jsp");

        Map<Integer, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("collect = " + collect);

        collect.entrySet().stream()
                .forEach(System.out::println);
    }
}
