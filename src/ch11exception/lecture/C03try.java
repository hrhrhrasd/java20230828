package ch11exception.lecture;

public class C03try {
    public static void main(String[] args) {
        System.out.println("code1~~");
        System.out.println("code2~~");

        int i = 0;
        try {
            /**
             * try block : exception이 발생 할 수 있는 코드
             */
            int j = 3/i;
        } catch (ArithmeticException e) {
            /**
             * catch block : 발샐한 exception 객체를 잡은후 실행하는 코드
             */
            System.out.println("ArithmeticException 발생");
        }

        System.out.println("code3~~");
    }
}
