package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C05nestedList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(88);
        list.add(77);
        System.out.println(list.toString());

        List<List<Integer>> list1 = new ArrayList<>();
        list1.add(List.of(9,8,7));
        list1.add(List.of(10,20,30));
        list1.add(List.of(1,2,3));
        list1.add(List.of(45,55,71));
    }
}
