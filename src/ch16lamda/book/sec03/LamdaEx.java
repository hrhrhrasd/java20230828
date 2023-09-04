package ch16lamda.book.sec03;

public class LamdaEx {
    public static void main(String[] args) {
        Person person= new Person();

        person.action1((name, job)-> {
            System.out.println("이름 : "+name);
            System.out.println("직업 : "+job);
        });
        person.action1((name, job)-> System.out.println(name +","+job));

        person.action2(speak-> System.out.println(speak));
    }
}

class Person {
    public void action1(Workable workable) {
        workable.work("홍길동", "프로그래밍");
    }
    public void action2(Speakable speakable) {
        speakable.speak("헬로");
    }
}

interface Workable {
    void work(String name, String job);
}

interface Speakable {
    void speak(String Content);
}

class MySpeakable implements Speakable {
    @Override
    public void speak(String Content) {
        System.out.println(Content);
    }
}