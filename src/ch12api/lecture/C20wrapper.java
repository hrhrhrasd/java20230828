package ch12api.lecture;

public class C20wrapper {
    // wrapper class : 기본타입을 감싸고있는 클래스
    //Integer, Double, Short, Byte, Long, Float, Character, Boolean

    // boxing : 기본타입 > 참조타입
    // unboxing : 참조타입 > 기본타입

    //boxing
    public static void main(String[] args) {
        int i = 500;
        Integer j = new Integer(i);     //boxing (권장하지 않음)
        Integer k = Integer.valueOf(i); //boxing

        //unboxing
        Integer l = Integer.valueOf(1000);
        int a = l.intValue();


        //auto boxing, unboxing
        int n = 777;
        Integer o = n;  //autoboxing;

        int m = o;  //auto unboxing
    }

}
