package ch07extends.book;

public class SmartPhone extends Phone{

    public boolean wifi;

    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        String wi = wifi ? "on" : "off";
        System.out.println("와이파이 상태를 변경했습니다. ("+wi+")");
    }

    public void internet() {
        System.out.println("인터넷 연결합니다");
    }
}
