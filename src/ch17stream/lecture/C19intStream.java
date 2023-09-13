package ch17stream.lecture;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C19intStream {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(8, 4, 2, 7, 8, 5);

        // 최댓값 구하기
        OptionalInt max = intStream.max();
        System.out.println("max = " + max.orElse(0));
        // 최솟값 구하기
        IntStream intStream1 = IntStream.of(8, 4, 2, 7, 8, 5);
        OptionalInt min = intStream1.min();
        System.out.println("min = " + min.orElse(0));
        // 평균 구하기
        IntStream intStream2 = IntStream.of(8, 4, 2, 7, 8, 5);
        OptionalDouble average = intStream2.average();
        System.out.println("average = " + average.orElse(0));
    }
}
