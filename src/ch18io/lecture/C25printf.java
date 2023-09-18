package ch18io.lecture;

public class C25printf {
    public static void main(String[] args) {
        System.out.printf("출력 문자");
        // %n : new line
        System.out.printf("%n");
        System.out.printf("출력 문자2", "asd", 3, 5,6);
        //%% : %출력
        System.out.printf("%n%%출력");
    }
}
