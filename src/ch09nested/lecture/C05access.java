package ch09nested.lecture;

public class C05access {
    String name = "java";

    class InnerClass {
        String name = "spring";

        void method() {
            System.out.println(name);           //inner
            System.out.println(this.name);      //inner
            System.out.println(C05access.this.name);    //outer
        }
    }

    public static void main(String[] args) {
        C05access o1 = new C05access();
        InnerClass o2 = o1.new InnerClass();
    }
}
