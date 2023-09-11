package ch15collection.book.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapEx {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 85);
        map.put("신용권", 95);

        System.out.println("총 entry수 : " + map.size());
        System.out.println();

        System.out.println("map.get(\"홍길동\") = " + map.get("홍길동"));

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k +" : " +v);
        }
        System.out.println();
        
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " +v);
        }
        System.out.println();
        
        map.remove("홍길동");
        System.out.println("map.size() = " + map.size());

        System.out.println("-------------------------");

        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("========================");

        map.forEach((k,v) -> System.out.println(k + " : " +v));

    }
}
