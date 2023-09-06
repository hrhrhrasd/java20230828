package ch12api.lecture;

public class C19hangul {
    //유니코드
    public static void main(String[] args) {
        System.out.println("손흥민".matches("[\uac00-\ud7a3]{3}"));
        System.out.println("손흥민".matches("[가-힣]{3}"));
        System.out.println("손흥민".matches("\\p{IsHangul}{3}"));
    }
}
