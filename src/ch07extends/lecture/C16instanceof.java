package ch07extends.lecture;

public class C16instanceof {
    public static void main(String[] args) {
        Animal16 ani1 = new Dog16();
        Animal16 ani2 = new Cat16();
        Animal16 ani3 = new Animal16();

        //instanceof 연산자
        //연산결과 : true / false (boolean)
        //좌변 : 참조변수 우변 : 타입

        boolean res1 = ani1 instanceof Animal16; //true
        boolean res2 = ani1 instanceof Dog16; // true
        boolean res3 = ani1 instanceof Cat16; //false

        boolean res4 = ani2 instanceof Animal16;    //true
        boolean res5 = ani2 instanceof Dog16;   //false
        boolean res6 = ani2 instanceof Cat16;   //true

        boolean res7 = ani3 instanceof Animal16;    //true
        boolean res8 = ani3 instanceof Dog16;   //false
        boolean res9 = ani3 instanceof Cat16;   //false
    }
}

class Animal16 {}

class Dog16 extends Animal16 {}

class Cat16 extends Animal16 {}
