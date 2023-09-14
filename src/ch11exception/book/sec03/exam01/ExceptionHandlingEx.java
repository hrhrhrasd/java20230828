package ch11exception.book.sec03.exam01;

public class ExceptionHandlingEx {
    public static void main(String[] args) {
        String[] arr = {"100", "1oo"};
        int value=0;
        for (int i = 0; i <=arr.length;i++) {
            try {
                value = Integer.parseInt(arr[i]);
                System.out.println("arr["+i+"] : " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 초가됨" + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환 할 수 없음" + e.getMessage());
            } finally {
                System.out.println(value);
            }
        }
    }
}
