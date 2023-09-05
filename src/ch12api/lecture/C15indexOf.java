package ch12api.lecture;

import java.util.Arrays;

public class C15indexOf {
    public static void main(String[] args) {
        //indexOf : 특정 문자열이 시작하는 위치 리턴 왼쪽부터 첫 등장기준
        String a = "spring ring asasd ring";

        System.out.println(a.indexOf("ring"));  //2

        System.out.println(a.lastIndexOf("ring"));  //18 오르쪽 부터 서치

        System.out.println(a.indexOf("ring", 3)); //7 인덱스3부터 서치
        System.out.println(a.indexOf("q"));


        String asd = "5hoco31a1e";
        String asdd = asd.replaceAll("[^0-9]"," ");
        System.out.println(asdd);

        String[] b = asdd.trim().split(" ");

        System.out.println(Arrays.toString(b));
    }





}
