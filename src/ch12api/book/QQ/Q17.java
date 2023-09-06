package ch12api.book.QQ;

import java.util.regex.Pattern;

public class Q17 {
    public static void main(String[] args) {
        String id = "5Angel1004";
        String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
        boolean ismatch = id.matches(regExp);
        boolean ismatch2 = Pattern.matches(regExp,id);
        if (ismatch) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
    }
}
