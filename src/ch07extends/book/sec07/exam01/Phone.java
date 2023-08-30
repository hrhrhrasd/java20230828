package ch07extends.book.sec07.exam01;

public class Phone {

    public String model;
    public String color;

    public void bell() {
        System.out.println("벨이 울립니다");
    }

    public void sendVoice(String msg) {
        System.out.println("나 : "+msg);
    }

    public void receiveVoice(String msg) {
        System.out.println("상대 : "+msg);
    }

    public void hangup() {
        System.out.println("통화를 종료합니다.");
    }
}
