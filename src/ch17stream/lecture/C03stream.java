package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C03stream {
    public static void main(String[] args) {
        List<String> list = List.of("java", "css", "spring");
        Stream<String> stream = list.stream();

        stream.count();
//        stream.count(); // 에러

        Stream<String> stream1 = list.stream();
        stream1.count();
    }
}
