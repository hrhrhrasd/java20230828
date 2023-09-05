package prec;

import java.util.Arrays;
import java.util.regex.*;

public class Pre {
    public static void main(String[] args) {
        Pre pre = new Pre();
        System.out.println(pre.sumNumbers("5hoco1a1e"));

    }

    public int sumNumbers(String str) {
        int asd= 0;

        String a = str.replaceAll("[^0-9]"," ");

        if (a.trim().equals("")) {
            return 0;
        }

        String[] b = a.trim().split(" ");
        for (int i=0; i<b.length;i++) {
            b[i] = b[i].replaceAll(" ", "");
        }

        System.out.println(Arrays.toString(b));

        for (int i=0; i<b.length;i++) {
            if (b[i].equals("")) {

            } else {
                asd += Integer.parseInt(b[i].trim());
            }

        }
        return asd;
    }
}
