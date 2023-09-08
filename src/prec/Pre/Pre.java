package prec.Pre;

import java.util.*;

public class Pre {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.solution(new int[][]{{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}}));
    }

}



class Solution {
    public int solution(int[][] board) {
        int a = 1;
        int b = board.length < board[0].length ? board.length : board[0].length;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    Loop1:
                    for (int c = 1; c < b; c++) {
                        for (int ii = i; ii < board.length; ii++) {
                            if (board[ii][j] == 0)
                                continue Loop1;
                        }
                        for (int jj = j; jj < board[0].length; jj++) {
                            if (board[i][jj] == 0)
                                continue Loop1;
                        }
                        a = a > (c + 1) + (c + 1) ? a : (c + 1) + (c + 1);
                    }


                }
            }
        }
        return a;
    }
}
