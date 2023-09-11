package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C12map {
    public static void main(String[] args) {
        //key, value 쌍(entry) 를 저장
        //key 중복불가, value 중복 가능

        Map<String, String > map = new HashMap<>();

        //entry 추가
        map.put("st1", "손흥민");
        map.put("st2", "이강인");
        map.put("st3", "김민재");

        System.out.println(map);
        //entry 삭제
        map.remove("st2");

        System.out.println(map);
        //entry 교체
        map.put("st3", "박지성");

        System.out.println(map);
        //entry 의 value 꺼내기
        System.out.println(map.get("st1"));

        //entry 개수 확인
        map.size();

    }
}
