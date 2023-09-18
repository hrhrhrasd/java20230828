package ch18io.lecture;

public class C24varargs {
    public static void main(String[] args) {
        //varargs(variable arguments, 가변인자) : ...
        method1(1);
        method2(2,3);
        method3(new int[]{10,20,49});

        //
        method1();  //안넣어도 됨
        method1(2);
        method1(2, 5);
        method1(2, 6, 7, 8);
        method1(2, 6, 7, 4, 34, 34);
    }

    public static void method1(int... a) {
        // 가변인자 사용법
        // 배열로 사용
        // 파라미터 목록 마지막에만 사용 가능
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void method2(int a, int b) {

    }

    public static void method3(int[] a) {

    }
}
