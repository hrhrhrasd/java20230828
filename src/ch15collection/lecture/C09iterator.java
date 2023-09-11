package ch15collection.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C09iterator {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("spring");
        set.add("css");

        //반복문 사용중 collection 변경시 exception 발생
//        for (String ele : set) {
//            System.out.println("ele = " + ele);
//            if(ele.equals("css")) {
//                set.remove("css");
//            }
//        }

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("item = " + item);
            iterator.remove();
        }

        System.out.println(set.size());
    }
}
