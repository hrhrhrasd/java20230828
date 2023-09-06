package ch12api.lecture;

public class C18regex {
    //정규 표현식
    public static void main(String[] args) {
        System.out.println("x".matches("x"));


        // 수량자(quanrifiers
        System.out.println("xxx".matches("x{3}"));//true
        System.out.println("aaa".matches("a{3}"));//true
        System.out.println("aa".matches("a{3}"));//false

        System.out.println("----------------------1");

        System.out.println("aaa".matches("a{1,3}"));//true
        System.out.println("aa".matches("a{1,3}"));//true
        System.out.println("a".matches("a{1,3}"));//true

        System.out.println("----------------------2");

        System.out.println("dog".matches("do{1,3}g"));
        System.out.println("doog".matches("do{1,3}g"));
        System.out.println("dooog".matches("do{1,3}g"));

        System.out.println("----------------------3");

        //그룹 ()
        System.out.println("dodog".matches("(do){1,3}g"));
        System.out.println("dododog".matches("(do){1,3}g"));
        System.out.println("dog".matches("(do){1,3}g"));

        //수량 : X?(0or1)  X*(0이상)=={0,}  X+(1이상)
        System.out.println("dog".matches("do{1,}g"));//o가 1개이상
        System.out.println("doooooooog".matches("do{1,}g"));//o가 1개이상
        System.out.println("dooooog".matches("do{1,}g"));//o가 1개이상
        System.out.println("doooooooooooooog".matches("do{1,}g"));//o가 1개이상

        System.out.println("----------------------4");

        // X?  0or1
        System.out.println("dg".matches("do?g"));
        System.out.println("dog".matches("do?g"));
        System.out.println("doog".matches("do?g"));

        System.out.println("----------------------5");

        //* 0이상
        System.out.println("dg".matches("do*g"));
        System.out.println("doooog".matches("do*g"));
        System.out.println("doooooooooooog".matches("do*g"));

        System.out.println("----------------------6");

        // + 1이상
        System.out.println("dg".matches("do+g"));
        System.out.println("dog".matches("do+g"));
        System.out.println("do0g".matches("do+g"));

        System.out.println("----------------------7");

        //문자 분류
        System.out.println("dog".matches("d[oi]g")); //가운데가 o or i
        System.out.println("dig".matches("d[oi]g"));
        System.out.println("djg".matches("d[oi]g"));

        System.out.println("----------------------8");

        System.out.println("dog".matches("d[^oi]g")); //not
        System.out.println("dig".matches("d[^oi]g"));
        System.out.println("dag".matches("d[^oi]g"));

        System.out.println("----------------------9");

        //문주 분류기호
        System.out.println("0".matches("[0-9]"));
        System.out.println("7".matches("[0-9]"));
        System.out.println("0".matches("\\d"));
        System.out.println("7".matches("\\d"));

        System.out.println("----------------------9");

        // 예제 : 숫자로시작 x , 영문대소문자,_,$
        System.out.println("asds2314fsd_$".matches("[a-zA-Z_$][0-9a-zA-Z_$]*"));

        //전화번호
        System.out.println("021235678".matches("(02|010)-?[0-9]{3,4}-?[0-9]{4}"));

        //모든 문자 .       (.) > /.
        System.out.println("alkd2as.lkdcz&*(^&*".matches(".+"));

        //이메일 (약식)
        //영문소문자,숫자 여러개 @ 영문소문자 숫자 여러개 . 영소문자,숫자여러개
        System.out.println("dis2d2@gole2.com2".matches("[a-z0-9]+@[a-z0-9]+\\.[a-z0-9]+"));

        //or : |
        System.out.println("asddogemas".matches(".*(dog|cat).*"));
        System.out.println("asdnvcatodmw".matches(".*(dog|cat).*"));
    }
}
