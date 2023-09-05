package ch12api.book.QQ;

public class Q06 {
    public static void main(String[] args) {
        Member m1 = new Member("blue", "이파란");
        System.out.println(m1.toString());
    }
}

class Member {
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id+": "+name;
    }
}
