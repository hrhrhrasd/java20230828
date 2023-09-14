package ch11exception.lecture;

public class C12polymorphism {
    public static void main(String[] args) {
        try {
            // ClassCastException
            // NullPointerException
            // ArithmeticException
        } catch (RuntimeException e) {
            // NullPointerException
            // ArithmeticException
        } //catch (ClassCastException e) {  //불가(위에서 이미 처리됨)
//            // ClassCastException
//        }


        try {
            // ClassCastException
            // NullPointerException
            // ArithmeticException
        } catch (ClassCastException e) {
            // ClassCastException
        } catch (RuntimeException e) {
            // NullPointerException
            // ArithmeticException
        }
    }
}
