package ch16lamda.book.sec05.exam02;

public class MethodRefEx {
    public static void main(String[] args) {
        Person person = new Person();
        person.ordering(String::compareToIgnoreCase);
    }
}

interface  Comparable {
    int compare(String a, String b);
}

class Person {
    public void ordering(Comparable comparable) {
        String a= "홍길동";
        String b= "김길동";

        int result = comparable.compare(a,b);

        if (result < 0)
            System.out.println(a+"은"+b+"보다 앞에옵니다");
        else if (result ==0) {
            System.out.println(a+"은"+b+"과 같습니다");
        } else
            System.out.println(a+"은"+b+"보다 뒤에옵니다");
    }
}