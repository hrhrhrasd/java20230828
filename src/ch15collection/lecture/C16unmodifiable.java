package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C16unmodifiable {
    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        list.add("java");
        list.add("spasf");
        list.add("asfluj");
        list.remove(0);

        //수정 불가 리스트 만들기
        List<String> list2 = List.of("java", "spring", "css");
//        list2.add("asdfs"); 에러
//        list2.remove(0);

        System.out.println("프로그램끝");
    }
}
