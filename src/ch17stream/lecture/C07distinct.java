package ch17stream.lecture;

import java.util.List;

public class C07distinct {
    public static void main(String[] args) {
    List<Integer> list = List.of(3,2,5,6,2,5,6);
    long count = list.stream()
            .distinct()
            .count();

        System.out.println("count = " + count);
    }
}
