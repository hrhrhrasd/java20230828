package ch15collection.book.sec06.exam01;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println("coin = " + coin.getValue());
        }
    }
}

class Coin {
    private int value;

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
