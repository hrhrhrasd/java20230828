package ch12api.lecture;

public class C16replace {
    public static void main(String[] args) {
        // replace : 특정 문자열 > 다른 문자열로 변경
        String a = "spring";
        String b =a.replace("sp", "abc");
        System.out.println(b);

        String c = "java is java";
        System.out.println(c.replace("java", "asd"));

        String d = "Java is java";
        System.out.println(d.replace("java", "asd"));
    }
}
