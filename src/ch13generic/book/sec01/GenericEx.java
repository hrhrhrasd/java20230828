package ch13generic.book.sec01;

public class GenericEx {
    public static void main(String[] args) {
        Box<String> o1 = new Box<>();
        o1.content = "java";
        String str = o1.content;
        System.out.println(str);

        Box<Integer> o2 = new Box<>();
        o2.content = 300;
        Integer i = o2.content;
        System.out.println(i);
    }
}

class Box<T> {
    public T  content;
}
