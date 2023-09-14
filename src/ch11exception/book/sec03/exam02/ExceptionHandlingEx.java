package ch11exception.book.sec03.exam02;

public class ExceptionHandlingEx {
    public static void main(String[] args) {
        String[] arr = {"100", "1oo", null};

        for (int i = 0; i <= arr.length; i++) {
            try {
                int value = Integer.parseInt(arr[i]);
                System.out.println("arr[" + i + "] : " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 초과" + e.getMessage());
            } catch (Exception e) {
                System.out.println("실행 오류");
            }
        }
    }
}
