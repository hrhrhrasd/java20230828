package ch11exception.lecture;

public class C11polymorphism {
    public static void main(String[] args) {
        try {

        } catch (NullPointerException e) {

        } catch (ArithmeticException e) {

        }

        //cath 내용이 같다면 상위타입으로 받아서 한번에 처리 가능

        try {

        } catch (RuntimeException e) {

        }

        try {

        } catch (Exception e) {

        }

        try {

        } catch (Throwable e) {

        }
    }
}
