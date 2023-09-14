package ch11exception.book.qq;

public class Q07 {
    public static void main(String[] args) {
        login("whire", "12345");
        login("blue", "54321");
        login("blue", "12345");

    }

    public static void logincheck(String id, String password) throws NotExistIdException, WrongPasswordException {
        if (!id.equals("blue")) {
            throw new NotExistIdException("아이디가 존재하지 않습니다");
        }
        if (!password.equals("12345")) {
            throw new WrongPasswordException("패스워드가 틀립니다");
        }

        System.out.println("로그인 성공");
    }

    public static void login(String id, String password) {
        try {
            logincheck(id, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

class NotExistIdException extends Exception {
    public NotExistIdException() {
    }

    public NotExistIdException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
