package ch16lamda.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04parameter {
    public static void main(String[] args) {
        MyInterface04 o1 = x -> {

        };

        List<String> list = List.of("java", "spring", "css", "html");
        System.out.println(list);
        list.forEach(e-> System.out.println(e));

        int[] arr = {10,20,30,40, 100, 200, 300};
        Arrays.stream(arr).forEach(e -> System.out.println(e));
        System.out.println();
        Arrays.stream(arr).forEach(System.out::println);
    }
}

interface MyInterface04 {
    void method(int x);
}
