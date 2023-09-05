package ch12api.lecture;

public class C13string {
    public static void main(String[] args) {
        //substring : 부분 문자열 추출
        String a =  "spring";
        System.out.println(a.substring(0,2));   //sp
        System.out.println(a.substring(5)); //g
    }

    public String doubleChar(String str) {
        String s = "";
        char a;

        for (int i=0; i<str.length();i++) {
            a = str.charAt(i);
            s += + str.charAt(i) + str.charAt(i);;
        }
        return s;
    }


}
