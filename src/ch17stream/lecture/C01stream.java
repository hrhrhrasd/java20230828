package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C01stream {
    public static void main(String[] args) {
        List<String> list = List.of("java", "spring", "css", "react");

        for (String item : list) {
            System.out.println("item = " + item);
        }

        //stream
        Stream<String> s1 = list.stream();

        //메소드
        //중간연산 : 리턴타입 스트림
        //최종연산 : 리턴타입 다양함
        //최종연산시 stream 재사용 불가
        //최종연산과 중간연산을 같이 처리(딜레이)

        s1.skip(1).limit(2).forEach(x -> System.out.println(x));
    }
}
