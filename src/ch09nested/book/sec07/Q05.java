package ch09nested.book.sec07;

public class Q05 {
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public void work() {
                System.out.println("복사를 합니다");
            }
        };
        action.work();


        //람다식
        Action action2 = () -> System.out.println("복사");
        action2.work();
    }
}

interface Action {
    public void work();
}