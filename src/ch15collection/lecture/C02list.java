package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C02list {
    public static void main(String[] args) {
        //List : 순서가 있음, 중복 허용
        List<String> list = new ArrayList<>();
        list.add("asd");    //추가
        list.add("ad");    //추가
        list.add("ac");    //추가
        list.add("ae");    //추가
        list.add("af");    //추가
        int a = list.size();    //크기
        System.out.println(a);
        list.add("asdasf");    //추가
        System.out.println(list.size());

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        list.remove("asd");
        list.remove(0);

        System.out.println(list.size());

        System.out.println("for문 사용");
        for (int i=0; i < list.size();i++) {
            System.out.println(list.get(i));
        }

        System.out.println("향상된 for문");
        for (String i : list) {
            System.out.println(i);
        }

        System.out.println("foreach");
        list.forEach(System.out::println);
    }
}
