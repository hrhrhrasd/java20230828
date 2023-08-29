package ch07extends.lecture;

public class C11polymorphism {
    public static void main(String[] args) {
        String s= "java";
        Object o = s;
        String a = "asd";

//        String t = o;     //x

        int v1 = s.hashCode();
        int v2 = o.hashCode();

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);

        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(a));
    }
}
