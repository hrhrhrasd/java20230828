package ch12api.book.sec03.exam03;

public class ToStringEx {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("삼성", "안드로이드");
        String strObj = s1.toString();
        System.out.println(strObj);

        System.out.println(s1);
    }
}

class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "company='" + company + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}