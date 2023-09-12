package ch17stream.lecture;

import java.util.List;

public class C11sorted {
    public static void main(String[] args) {
        var list = List.of(10,35,32,20,44,5);
        //내림차순
        list.stream()
                .sorted((x,y) -> y-x)
                .forEach(System.out::println);
    }
}
