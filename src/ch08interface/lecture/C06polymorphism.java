package ch08interface.lecture;

public class C06polymorphism {
    public static void main(String[] args) {
        Hero me = new Hero();
        me.setW(new Gun());

        me.attack();

        me.setW(new Bow());
        me.attack();
    }
}

class Hero {
    private Weapon w;

    public void setW(Weapon w) {
        this.w = w;
    }

    public void attack() {
        w.trigger();
    }
}

interface Weapon {
    void trigger();

}

class Gun implements Weapon {
    @Override
    public void trigger() {
        System.out.println("총 발사");
    }
}

class Bow implements Weapon {
    @Override
    public void trigger() {
        System.out.println("활 발사");
    }
}