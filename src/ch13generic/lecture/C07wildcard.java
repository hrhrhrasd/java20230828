package ch13generic.lecture;

public class C07wildcard {
    public void otherMethod() {
        someMethod(new MyClass07<Dog>());
        someMethod(new MyClass07<Cat>());

        someMethod2((new MyClass07<Animal>()));
        someMethod2((new MyClass07<Object>()));


    }
    public void someMethod(MyClass07<? extends  Animal> param) {
        Animal item = param.getItem();
    }

    public void someMethod2(MyClass07<? super Animal> param) {
        param.setItem(new Animal());
        param.setItem(new Cat());
        param.setItem(new Dog());
    }
}

class MyClass07<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}