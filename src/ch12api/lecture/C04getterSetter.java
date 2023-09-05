package ch12api.lecture;

public class C04getterSetter {
    public static void main(String[] args) {
        MyClass04 o1 = new MyClass04("홍길동",33);
        System.out.println(o1);

        o1.setName("가나다");
        System.out.println(o1);
        System.out.println(o1.getName());

    }
}

class MyClass04{
    private String name;
    private int age;

    public MyClass04(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyClass04{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}