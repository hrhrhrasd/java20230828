package ch16lamda.book.sec05.exam03;

public class ConstructorRefEx {
    public static void main(String[] args) {
        Person person = new Person();

        Member m1 = person.getMember1(Member::new);
        System.out.println(m1);

        System.out.println("-----------------");

        Member m2 = person.getMember2(new Creatable2() {
            @Override
            public Member create(String id, String name) {
                return new Member(id, name);
            }
        });
        System.out.println(m2);
    }
}

interface Creatable1 {
    public Member create(String id);
}

interface Creatable2 {
    public Member create(String id, String name);
}

class Member {
    private String id;
    private String name;

    public Member(String id) {
        this.id=id;
        System.out.println("Member(String id)");
    }

    public Member(String id, String name) {
        this.id=id;
        this.name=name;
        System.out.println("Member(String id, String name");
    }

    public String toString() {
        String info = "{ id : " +id+" name: "+name+" }";
        return info;
    }
}

class Person {
    public Member getMember1(Creatable1 creatable1) {
        String id = "winter";
        Member member = creatable1.create(id);
        return member;
    }

    public Member getMember2(Creatable2 creatable2) {
        String id = "winter";
        String name = "한겨울";
        Member member = creatable2.create(id, name);
        return member;
    }
}