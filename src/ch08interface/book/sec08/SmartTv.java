package ch08interface.book.sec08;

public class SmartTv implements RemoteControl, Searchable{
    @Override
    public void turnOn() {
        System.out.println("티비온");
    }

    @Override
    public void turnOff() {
        System.out.println("티비오프");
    }

    @Override
    public void Search(String url) {
        System.out.println(url +"을 검색합니다");
    }
}
