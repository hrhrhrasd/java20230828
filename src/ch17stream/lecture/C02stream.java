package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C02stream {
    public static void main(String[] args) {
        List<String> list = List.of("ab", "de", "xy");
        Stream<String> stream = list.stream();
        stream.map(e->e+e).forEach(System.out::println);
    }
}
