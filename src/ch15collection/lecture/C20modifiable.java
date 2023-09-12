package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C20modifiable {
    public static void main(String[] args) {
        Set<String> set = Set.of("asd","dascdw","wdwd");
        Set<String> set2 = new HashSet<>(set);

        set2.add("dwdd");
    }
}
