package ch11exception.book.sec06;

public class Account {
    private long balance;

    public  Account() {}

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance =+ money;
    }

    public void withdraw(int money)throws InsufficiException {
        if (balance < money) {
            throw new InsufficiException("잔고부족"+ (money-balance)+"원 모자람");
        }
        balance -=money;
    }
}
