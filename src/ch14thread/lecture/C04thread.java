package ch14thread.lecture;

import java.awt.*;

public class C04thread {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        Thread thread1 = new MyThread1();
        thread1.run();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        //thread가 할 일 작성
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        //thread가 할 일 작성
        for (int i = 0; i < 5; i++) {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            System.out.println("SADDAS");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
