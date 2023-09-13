package ch17stream.book.sec10;

import java.util.Arrays;

public class AggergateeEx {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        long cnt = Arrays.stream(arr)
                .filter(n -> n%2 ==0)
                .count();
        System.out.println("2의배수 개수 = " + cnt);

        long sum = Arrays.stream(arr)
                .filter(n->n%2==0)
                .sum();
        System.out.println("2의배수의 합 = " + sum);

        double avg = Arrays.stream(arr)
                .filter(n->n%2==0)
                .average()
                .getAsDouble();
        System.out.println("avg = " + avg);

        int max = Arrays.stream(arr)
                .filter(n->n%2==0)
                .max()
                .getAsInt();
        System.out.println("max = " + max);

        int min = Arrays.stream(arr)
                .filter(n->n%2==0)
                .min()
                .getAsInt();
        System.out.println("min = " + min);

        int first =Arrays.stream(arr)
                .filter(n->n%3==0)
                .findFirst()
                .getAsInt();
        System.out.println("첫 번째 3의 배수 = " + first);
    }
}
