package ch08interface.book.QQ.Q06;

public interface Soundable {
    public String sound();
}

class Cat implements Soundable {

    @Override
    public String sound() {
        return "야옹";
    }
}

class Dog implements Soundable {
    @Override
    public String sound() {
        return "멍멍";
    }
}