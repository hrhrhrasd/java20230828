package ch17stream.lecture;

import java.util.List;

public class C12filter {
    public static void main(String[] args) {
        var list = List.of(2,5,34,17,55,32);
        list.stream()
                .filter(x -> x>=30)
                .forEach(System.out::println);

        System.out.println("짝수중 가장 작은 수");
        list.stream()
                .filter(e -> e%2==0)
                .sorted()
                .limit(1)
                .forEach(System.out::println);

        System.out.println("홀수중 가장 큰 값");
        list.stream()
                .filter(e -> e%2==1)
                .sorted((x,y) -> y-x)
                .limit(1)
                .forEach(System.out::println);
    }
}
