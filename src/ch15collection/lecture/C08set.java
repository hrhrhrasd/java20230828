package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C08set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("re2al");
        set.add("asd asd");

        set.forEach(System.out::println);
        System.out.println();
        set.forEach(System.out::println);
    }
}
