package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C19modifiable {
    public static void main(String[] args) {

        List<String> list1 = List.of("asd", "xzc", "cqwe");

        List<String> list2 = new ArrayList<>(list1);
        list2.add("java");
    }
}
