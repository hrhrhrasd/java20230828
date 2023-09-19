package ch14thread.lecture;

public class C14synchronized {
    public static void main(String[] args) {
        MyBox14 box = new MyBox14(0);
        Thread t1 = new Thread(new Task14(box));

    }
}

class Task14 implements Runnable {
    private MyBox14 box;

    public Task14(MyBox14 box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            box.increment();
        }
    }
}

class MyBox14 {
    private int value;

    public MyBox14(int value) {
        this.value = value;
    }

    public void increment() {
        synchronized (this) {
            value++;
        }
    }

    public synchronized void increment1() {
        //monitor lock : this
        value++;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
