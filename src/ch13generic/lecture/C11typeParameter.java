package ch13generic.lecture;
public class C11typeParameter {
}

class MyClass11<T extends Animal> {
    public void method(T param) {
        param.equals(null);
        param.toString();
    }
}
