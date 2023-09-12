package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C21modifiable {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1,"asd",2,"4242",3,"acwff");
        Map<Integer, String> map2 = new HashMap<>(map);
    }
}
