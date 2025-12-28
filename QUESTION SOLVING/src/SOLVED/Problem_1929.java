package SOLVED;

import java.util.Arrays;

public class Problem_1929 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 2, 1};
        concat(nums);
    }

    static void concat(int[] nums) {
        int[] out = new int[nums.length * 2];
//    System.out.println(nums.length*2);
        int n = nums.length ;
        for (int i = 0; i < nums.length ; i++) {
            out[i] = nums[i] ;
            out[i+n] = nums[i] ;
        }
        System.out.println(Arrays.toString(out)) ;
    }


}
