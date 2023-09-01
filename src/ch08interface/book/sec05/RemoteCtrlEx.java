package ch08interface.book.sec05;

public class RemoteCtrlEx {
    public static void main(String[] args) {
        RemoteCtrl rc;

        rc = new Tv();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);

        rc.turnOff();
    }

}

interface RemoteCtrl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다");
        }

    }
}

class Audio implements RemoteCtrl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteCtrl.MAX_VOLUME) {
            this.volume = RemoteCtrl.MAX_VOLUME;
        } else if (volume < RemoteCtrl.MIN_VOLUME) {
            this.volume = RemoteCtrl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 오디오 볼륨 : " + this.volume);
    }

    private int memoryVolume;

    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음처리합니다");
            setVolume(RemoteCtrl.MIN_VOLUME);
        } else {
            System.out.println("무음 해제");
            setVolume(this.memoryVolume);
        }
    }
}

class Tv implements RemoteCtrl {
    private  int volume;

    @Override
    public void turnOn() {
        System.out.println("티비 온");
    }

    @Override
    public void turnOff() {
        System.out.println("티비 오프");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteCtrl.MAX_VOLUME) {
            this.volume = RemoteCtrl.MAX_VOLUME;
        } else if (volume < RemoteCtrl.MIN_VOLUME) {
            this.volume = RemoteCtrl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 티비 볼륨 : " + volume);
    }
}