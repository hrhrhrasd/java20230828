package ch17stream.lecture;

import java.util.stream.IntStream;

public class C20primitvie {
    public static void main(String[] args) {
        //기본타입 stream : IntStream, LongStream, DoubleStream;
        //참조타입 : Stream<T>

        //기본타입 Stream > 참조타입 Stream
        //boxed 메소드
        Integer max = IntStream.of(3, 5, 3, 4, 5 )
                .boxed()
                .max(Math::max)
                .get();
    }
}
