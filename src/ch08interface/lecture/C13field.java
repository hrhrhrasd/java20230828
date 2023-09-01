package ch08interface.lecture;

public class C13field {
    public static void main(String[] args) {
        System.out.println(MyInterf13.VALUE);
        System.out.println(MyInterf13.NAME);
        System.out.println(MyInterf13.HOME);
    }
}

interface MyInterf13 {
    int VALUE = 0; // public static final
    public static final String NAME = "java";
    String HOME = "seoul";
}