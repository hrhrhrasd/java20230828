package prec;

import java.util.Arrays;
import java.util.regex.*;

public class Pre {
    public static void main(String[] args) {
        int a = 11; int cnt=0;
        int n = 2;
        Loop1:
        for (int j = n - 1; j >= 1; j--) {
            a %= 3 * Math.pow(5, j);
            if (a > 2 * Math.pow(5, j) && a <= 3 * Math.pow(5, j))
                continue Loop1;
            else
                a %= Math.pow(5, j);
        }

        System.out.println(a);
    }
}
