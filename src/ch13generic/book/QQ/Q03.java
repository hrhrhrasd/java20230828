package ch13generic.book.QQ;

public class Q03 {
    public static void main(String[] args) {
        Cont<String, String> cont1 = new Cont<>();
        cont1.set("홍길동", "도적");
        String name1 = cont1.getKey();
        String job = cont1.getValue();

        Cont<String, Integer> cont2 = new Cont<>();
        cont2.set("홍길동", 35);
        String name2 = cont2.getKey();
        int age = cont2.getValue();
    }
}

class Cont<T, V> {
    private  T key;
    private  V value;

    public void set(T key, V value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
