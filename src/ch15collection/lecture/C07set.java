package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C07set {
    //set : 객체(item, element ...)를 담고 있는 객체
    //특징 : 중복 x 순서 x
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("java");
        set1.add("spring");
        set1.add("react");
        set1.add("java");

        //size : 원소의 개수
        System.out.println(set1.size());    //3

        //contains
        System.out.println(set1.contains("java"));
        System.out.println(set1.contains("html"));

        //remove : 삭제
        set1.remove("java");    //true 반환
        set1.remove("html");    //false 반환

        System.out.println(set1.size());

        //of : 새로운 set 객체 생성(수정 불가)
        Set<String> set2 = Set.of("css", "react", "html");
//        set2.add("java"); //에러

        //전체 탐색
        //향상된 for문
        for (String str : set2) {
            System.out.println(str);
        }

        //foreach
        set2.forEach(System.out::println);
        set2.forEach(a -> System.out.println(a));
    }
}
