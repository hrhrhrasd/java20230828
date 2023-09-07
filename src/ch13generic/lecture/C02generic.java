package ch13generic.lecture;

public class C02generic {
    public static void main(String[] args) {
        MyClass02<Object> o1 = new MyClass02<Object>();
        MyClass02<String> o2 = new MyClass02<>();
        MyClass02<Integer> o3 = new MyClass02<>();
        MyClass02<Boolean> o4 = new MyClass02<>();


    }
}


//generic type
class MyClass02<T> {    //<T> > type parameter 참조 타입만 가능
    private T a;

}