package ch08interface.book.QQ.Q06;

public class SoundableEx {
    public static  void  printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
}
