package ch07extends.book.sec10.exam01;

abstract class Phone {
    String owner;

    Phone(String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("전원을 킵니다");
    }

    void turnOff() {
        System.out.println("전원을 끕니다");
    }
}

class SmartPhone extends Phone {
    SmartPhone(String owner) {
        super(owner);
    }

    void internetSearch() {
        System.out.println("인터넷 검색");
    }
}

class PhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

    }
}