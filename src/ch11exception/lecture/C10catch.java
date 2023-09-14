package ch11exception.lecture;

public class C10catch {
    public static void main(String[] args) {
        try {
            // exception 발생 가능 코드

        } catch (ArrayIndexOutOfBoundsException e) {

        } catch (NumberFormatException e) {

        }

        try {

        } catch (ArrayIndexOutOfBoundsException |
        NumberFormatException e) {
            //중복된 코드 하나로 묶기
        }
    }
}
