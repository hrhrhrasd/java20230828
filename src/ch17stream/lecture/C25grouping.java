package ch17stream.lecture;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C25grouping {
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

        Map<Integer, Long> collect = list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        collect.entrySet()
                .forEach(e -> System.out.println(e.getKey() + "글자 : " + e.getValue()+"개"));


    }
}
