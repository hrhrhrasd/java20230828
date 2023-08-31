package ch08interface.book.sec08;

public class MultiInterfEx {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTv();

        rc.turnOn();
        rc.turnOff();

        Searchable sc = new SmartTv();

        sc.Search("asd");
    }
}
