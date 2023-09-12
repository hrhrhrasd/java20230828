package prec.pre;

import java.util.*;

public class Pre {
    public static void main(String[] args) {
        Solution s1 = new Solution();




        String[] str = {"asd", "ad"};
        String as = "ja";
        String a = "javava";
        System.out.println(str[0].charAt(0));
        a.contains(as);
    }

}



class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for (char a : s.toCharArray()) {
            if (a == '#') {
                if (!s1.isEmpty())
                s1.pop();
            } else {
                s1.push(a);
            }
        }

        for (char a : t.toCharArray()) {
            if (a == '#') {
                s2.pop();
            } else {
                s2.push(a);
            }
        }
        if (s1.equals(s2)) {
            return true;
        }
        return false;
}}