package ch15collection.book.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Message> msgQ = new LinkedList<>();

        msgQ.offer(new Message("sendMail", "홍길동"));
        msgQ.offer(new Message("sendSMS", "신용권"));
        msgQ.offer(new Message("sendKakaotalk", "김자바"));

        while (!msgQ.isEmpty()) {
            Message msg = msgQ.poll();
            switch (msg.command) {
                case "sendMail" :
                    System.out.println(msg.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS" :
                    System.out.println(msg.to + "님에게 SMS를 보냅니다.");
                    break;
                case "sendKakaotalk" :
                    System.out.println(msg.to + "님에게 카톡을 보냅니다.");
                    break;
            }
        }
    }
}

class Message {
    public String command;
    public String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}
