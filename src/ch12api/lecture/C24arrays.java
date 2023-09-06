package ch12api.lecture;

import java.util.Arrays;

public class C24arrays {
    public static void main(String[] args) {
        //Arrays : 배열을 다루는 메소드들이 있음
        //equals : 같은지 비교
        //fill : 특정값으로 채우기
        //sort : 오름차순 정렬
        //binarySearch : 이진서치(sort)필요
        //toString : 문자열로 변환

        int[] arr1 = new int[5];

        Arrays.fill(arr1, 5);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {3,-2,5,20,-6};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {3,4,5};
        int[] arr4 = {3,4,5};
        int[] arr5 = {4,3,5};

        System.out.println(arr3.equals(arr4));
        System.out.println(Arrays.equals(arr3,arr4));
        System.out.println(Arrays.equals(arr3,arr5));

        //binary search
        int[] arr6 = {1,2,5,7,8,9};
        System.out.println(Arrays.binarySearch(arr6,0));

    }
}
