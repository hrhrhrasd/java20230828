package ch15collection.lecture;

import java.util.Stack;

public class C14stack {
    public static void main(String[] args) {
        // stack(LIFO)
        // push // 아이템 추가
        // pop 마지막 아이템 꺼내기(삭제됨)
        // peek 마지막 아이템 보기(삭제 안됨)

        Stack<Integer> stack = new Stack<>();
        stack.push(9);
        stack.push(8);
        stack.push(5);

        System.out.println(stack.size());

        System.out.println(stack.pop());

        System.out.println(stack.size());
    }
}
