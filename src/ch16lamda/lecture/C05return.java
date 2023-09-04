package ch16lamda.lecture;

public class C05return {
    public static void main(String[] args) {
        MyInterface05 o1 = ()->{
            System.out.println("1");
            System.out.println("2");
            return 0;
        };

        o1.method();

        MyInterface05 o2 = ()-> 0;

        MyInterface05 o3 = new MyInterface05() {
            @Override
            public int method() {
                return 0;
            }
        };
    }
}

@FunctionalInterface
interface MyInterface05 {
    int method();
}

class  MyClass05 implements MyInterface05 {
    @Override
    public int method() {
        return 0;
    }
}