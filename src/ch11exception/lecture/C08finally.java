package ch11exception.lecture;

public class C08finally {
    public static void main(String[] args) {
        try {
            System.out.println("코드실행");
            return;
        } finally {
            System.out.println("반드시 실행");
        }

    }
}
