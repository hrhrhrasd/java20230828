package ch11exception.lecture;

public class C09catch {
    public static void main(String[] args) {

        //exception이 여러개 발생할 수 있으면
        //catch블록 여러개 사용
        try {
            int[] arr = new int[5];
            int i = 3/arr[0];
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("프로그램끝");
    }
}
