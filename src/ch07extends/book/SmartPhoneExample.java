package ch07extends.book;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myphone = new SmartPhone("갤럭시", "은색");

        System.out.println("model : "+myphone.model);
        System.out.println("color : " + myphone.color);

        System.out.println("와이파이 상태 :"+(myphone.wifi?"on":"off"));

        myphone.bell();
        myphone.sendVoice("hello");
        myphone.receiveVoice("asdsad");
        myphone.hangup();

        myphone.setWifi(true);
        myphone.internet();
        myphone.setWifi(false);
    }
}
