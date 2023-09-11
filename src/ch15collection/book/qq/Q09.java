package ch15collection.book.qq;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q09 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = "";
        int max = 0;
        int total = 0;

        Set<String> set = map.keySet();
        for (String k : set) {
            max = max > map.get(k) ? max : map.get(k);
            name = max > map.get(k) ? name : k;
            total += map.get(k);
        }

        System.out.println("avg : " +total/map.size());
        System.out.println("best : " +max);
        System.out.println("name : " +name);
    }
}
