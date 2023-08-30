package ch07extends.lecture;

public class C19polymorphism {
    public static void main(String[] args) {
        Hero19 me = new Hero19();
        me.weapon = new Gun();
        me.att();

        me.weapon = new Sword();
        me.att();

        System.out.println("게임 종료");
    }
}


class Hero19 {
    public Weapon weapon;

    public void att() {
        weapon.shot();
    }
}

class Weapon {
    public void shot() {
        System.out.println("무기를 사용합니다.");
    }
}

class Gun extends Weapon {
    @Override
    public void shot() {
        super.shot();
        System.out.println("총 발사");
    }
}

class Sword extends Weapon {
    @Override
    public void shot() {
        super.shot();
        System.out.println("검 휘두르기");
    }
}