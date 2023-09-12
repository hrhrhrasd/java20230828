package ch15collection.lecture;

import java.util.LinkedList;
import java.util.Queue;

public class C15queue {
    //queue : FIFO(선입선출)
    //ofer : 아이템 추가
    //poll : 아이템 꺼내기

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(100);
        queue.offer(200);
        queue.offer(500);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }

}
