package ch16lamda.book.QQ;

public class Q07 {
    private  static  int[] scores = { 10, 50, 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin((x, y) -> (x>y)?x:y);
        System.out.println("max = " + max);

        int min = maxOrMin((x, y) -> (x<y)? x : y);
        System.out.println("min = " + min);
    }
    
}

interface Operator {
    public int apply(int x, int y);
}
