package ch17stream.lecture;

import java.util.List;

public class C13map {
    public static void main(String[] args) {
        // map
        var list = List.of(3,1,2,5,10,15,7);

        //음수로 바꿔서 출력
        list.stream()
                .map(e -> -e)
                .forEach(System.out::println);

        System.out.println();

        list.stream()
                .map(e ->2*e)
                .forEach(System.out::println);

        list.stream()
                .map(e -> e*e)
                .forEach(System.out::println);
    }
}
