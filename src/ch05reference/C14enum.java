package ch05reference;

public class C14enum {
    public static void main(String[] args) {
        MySeason v1 = MySeason.FALL;

        System.out.println("v1.toString() = " + v1.toString());
        System.out.println("v1.hashCode() = " + v1.hashCode());

        System.out.println("v1.name() = " + v1.name());
        System.out.println("v1 = " + v1);
        System.out.println("v1.ordinal() = " + v1.ordinal()); // 0부터 순서
    }
}

enum MySeason {
    SPRING,
    SUMMER,
    FALL,
    WINTER
}