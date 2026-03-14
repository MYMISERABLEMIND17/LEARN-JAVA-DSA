package SOLVED;

import java.util.Arrays;

public class Problem_344 {
    public static void main(String[] args) {
        String[] arr = {"h","e","l","l","o"};
        logic(arr);
    }
    static void logic(String[] nums){

        for (int i = 0; i < nums.length/2 ; i++) {
            String temp = nums[i] ;
            nums[i] = nums[nums.length-i-1] ;
            nums[nums.length-1-i] = temp ;
        }
        System.out.println(Arrays.toString(nums));

    }
}
