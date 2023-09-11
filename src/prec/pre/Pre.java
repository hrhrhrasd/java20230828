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
    public boolean divideArray(int[] nums) {
        int a = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                a = map.get(nums[i]);
                map.put(nums[i], a+1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Integer v : map.values()) {
            if (v %2 == 1) {
                return false;
            }
        }
        return true;
    }
}