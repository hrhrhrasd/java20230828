package ch11exception.book.sec06;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account();
        //예금
        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());

        //출금
        try {
            account.withdraw(30000);
        } catch (InsufficiException e) {
            String messagge = e.getMessage();
            System.out.println(messagge);
        }
    }
}
