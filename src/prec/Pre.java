package prec;

import java.util.Arrays;
import java.util.regex.*;

public class Pre {
    public static void main(String[] args) {
        Pre pre = new Pre();
        int[][] asd = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(pre.solution(asd));

    }


    public int solution(int[][] triangle) {
        int answer = triangle[0][0];
        int n = 0;
        for (int i = 1; i < triangle.length; i++) {
            answer += triangle[i][n] > triangle[i][n + 1] ?
                    triangle[i][n] : triangle[i][n + 1];
            n = triangle[i][n] > triangle[i][n + 1] ? n : n + 1;
        }

        return answer;
    }
}
