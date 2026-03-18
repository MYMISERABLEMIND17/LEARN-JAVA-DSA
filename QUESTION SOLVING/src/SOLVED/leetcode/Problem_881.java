package SOLVED.leetcode;

import java.util.Arrays;

public class Problem_881 {
    public static void main(String[] args) {
        int[] x = {3,5,3,4};
        int limit = 5 ;
        logic(x , limit);
    }
    static void logic(int[] nums , int limit ){
        Arrays.sort(nums);
        int left = 0  ;
        int right  = nums.length-1;
        int count = 0 ;
        while(left <= right ){
            if(nums[left] + nums[right] <=limit ){
                left++ ;
                right-- ;
                count++ ;
            }
            else if (nums[left] + nums[right] > limit  ) {

                    right-- ;
                    count++ ;
            }
        }
        System.out.println(count);


    }
}
