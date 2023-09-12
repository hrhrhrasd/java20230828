package ch17stream.book.qq;

import java.util.Arrays;
import java.util.List;

public class Q05 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
           "this is a java book",
           "Lamda Expressions",
           "Java8 supports lamda expressions"
        );

        list.stream()
                .filter(e -> e.matches(".*[jJ][aA][vV][aA].*"))
                .forEach(System.out::println);
    }
}
