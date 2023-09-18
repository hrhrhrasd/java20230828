package ch14thread.book.sec05.exam02;

public class JoinEx {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("1~100합 : " + sumThread.getSum());
    }
}

class SumThread extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            sum+= i;
        }
    }
}
