package ch09nested.book.sec07.exam02;

public class HomeEx {
    public static void main(String[] args) {
        Home home = new Home();

        home.use1();

        home.use2();

        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("난방 온");
            }

            @Override
            public void turnOff() {
                System.out.println("난방 오프");
            }
        });
    }
}

interface RemoteControl {
    void turnOn();
    void turnOff();
}

class Home {
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("티비온");
        }

        @Override
        public void turnOff() {
            System.out.println("티입 오프");
        }
    };

    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    public void use2() {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨 온");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨 오프");
            }
        };

        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}