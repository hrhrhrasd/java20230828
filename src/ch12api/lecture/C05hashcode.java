package ch12api.lecture;

public class C05hashcode {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        int hash1 = o1.hashCode();
        int hash2 = o2.hashCode();
        Object o3 = o2;

        System.out.println(hash1);
        System.out.println(hash2);
        System.out.println(o3.hashCode());
    }
}
