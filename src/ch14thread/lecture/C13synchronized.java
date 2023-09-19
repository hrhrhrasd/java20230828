package ch14thread.lecture;

public class C13synchronized {
    public static void main(String[] args) {
        MyBox myBox = new MyBox(0);
        Thread thread = new Thread(new Task(myBox));
        thread.start();
        Thread thread1 = new Thread(new Task(myBox));
        thread1.start();

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("myBox.getValue() = " + myBox.getValue());

    }
}

class Task implements Runnable {
    private MyBox box;

    public Task(MyBox box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            box.increment();
        }
    }
}

class MyBox {
    private int value;
    private  Object lock = new Object();

    public MyBox(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public void increment() {
        synchronized (lock) {
            value++;
        }
    }
}