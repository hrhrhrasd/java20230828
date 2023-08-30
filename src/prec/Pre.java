package prec;

public class Pre {
    public static void main(String[] args) {
        int r1 = 2; int r2 = 3;
        int sum=0;
        double y1, y2;
        for (int x=1; x<r2; x++) {
            y1=Math.abs(Math.sqrt(Math.pow(r1,2)-Math.pow(x,2)));
            y2=Math.abs(Math.sqrt(Math.pow(r2,2)-Math.pow(x,2)));

            for (int  i= (int)Math.ceil(y1); i<=y2;i++) {
                if (i%1==0)
                    sum++;
            }
            if (y1==0)
                sum--;

        }
        int asd = (sum*4) + (r2-r1+1)*4;
        System.out.println(sum);
        System.out.println(Math.abs(Math.sqrt(Math.pow(r2,2)-Math.pow(1,2))));
        System.out.println(asd);

    }
}
