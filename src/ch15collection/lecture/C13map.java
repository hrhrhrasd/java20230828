package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class C13map {
    public static void main(String[] args) {
        //map 전체 탐색
        Map<String, String> map = new HashMap<>();
        map.put("st1", "흥민");
        map.put("st2", "강인");
        map.put("st3", "민재");

        // 향상된 for
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //keySet
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key + ":" +map.get(key));
        }

        //forEach
        System.out.println();
        map.forEach((s, s2) -> System.out.println(s+" : " +s2));
    }
}
