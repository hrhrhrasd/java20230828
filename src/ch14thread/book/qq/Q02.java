package ch14thread.book.qq;

public class Q02 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("동영상 재생");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("음악 재생");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
