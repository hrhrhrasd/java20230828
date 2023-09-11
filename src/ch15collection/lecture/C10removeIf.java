package ch15collection.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C10removeIf {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("css");
        set.add("jsp");
        set.add("spring");

        set.removeIf(e -> e.equals("css"));

//        Iterator<String > iterator1 = set.iterator();
//        while (iterator1.hasNext()) {
//            String item = iterator1.next();
//            if (item.equals("css")) {
//                iterator1.remove();
//            }
//        }

        System.out.println("set.size() = " + set.size());
        
    }
}
