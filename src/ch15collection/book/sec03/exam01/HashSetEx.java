package ch15collection.book.sec03.exam01;
import java.util.*;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java");
        set.add("Spring");

        System.out.println("총 객체 수 : " + set.size());
    }
}
