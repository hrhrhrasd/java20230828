package ch12api.lecture;

public class C17replaceAll {
    public static void main(String[] args) {
        // replceAll : 정규식 사용
        String a = "Java is java";
        System.out.println(a.replaceAll("(java|Java)", "asd"));
    }



}
