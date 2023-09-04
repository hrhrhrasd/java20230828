package ch16lamda.book.sec02.exam01;

public class LamdaEx {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(()-> {
            System.out.println("출근");
            System.out.println("asd");
        });

        person.action(() -> System.out.println("퇴근"));

        Workable o1 = ()-> {
            System.out.println("asdasd");
        };
        o1.work();
    }
}

interface Workable {
    void work();
}
class Person {
    public void action(Workable workable) {
        workable.work();
    }
}
