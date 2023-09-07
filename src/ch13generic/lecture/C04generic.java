package ch13generic.lecture;

public class C04generic {
    public static void main(String[] args) {
        MyClass04<String> o1 = new MyClass04<>();
        o1.setField("java");
        String f1 =o1.getField();
        System.out.println(f1);

        MyClass04<Integer> o2 = new MyClass04<>();
        o2.setField(3000);
        int f2 = o2.getField();
        System.out.println(f2);
    }
}


class MyClass04<T> {
    private T field;

    public void setField(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }
}