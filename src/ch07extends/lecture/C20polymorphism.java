package ch07extends.lecture;

import java.util.Arrays;

public class C20polymorphism {
    public static void main(String[] args) {

        Item item = getItem();

        item.printInfo();

        Item item1 = getItem();
        item1.printInfo();

        System.out.println("게임종료");
    }

    private static Item getItem() {
        double d = Math.random();
        return d<0.5? new Potion(): new Map();
    }
}

class Item {
    public void printInfo() {
        System.out.println("아이템 입니다");
    }
}

class Potion extends Item {
    @Override
    public void printInfo() {
        System.out.println("포션입니다");
    }
}

class Map extends Item {
    @Override
    public void printInfo() {
        System.out.println("지도입니다.");
    }
}

